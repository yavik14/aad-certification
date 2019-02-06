package com.theyavikteam.aad_certification.db;

import android.arch.lifecycle.MutableLiveData;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import com.theyavikteam.aad_certification.db.dao.BrawlerDao;
import com.theyavikteam.aad_certification.db.dao.ClubDao;
import com.theyavikteam.aad_certification.db.dao.UserBrawlerJoinDao;
import com.theyavikteam.aad_certification.db.dao.UserDao;
import com.theyavikteam.aad_certification.db.entity.BrawlerEntity;
import com.theyavikteam.aad_certification.db.entity.ClubEntity;
import com.theyavikteam.aad_certification.db.entity.UserBrawlerEntity;
import com.theyavikteam.aad_certification.db.entity.UserEntity;

@Database(entities = {UserEntity.class, BrawlerEntity.class, ClubEntity.class, UserBrawlerEntity.class}, version = 1)
public abstract class BrawlerDatabase extends RoomDatabase {

    private static BrawlerDatabase sInstance;

    @VisibleForTesting
    public static final String DATABASE_NAME = "brawlers_stats_db";

    public abstract ClubDao clubDao();
    public abstract UserDao userDao();
    public abstract BrawlerDao brawlerDao();
    public abstract UserBrawlerJoinDao userBrawlerJoinDao();

    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();

    public static BrawlerDatabase getInstance(final Context context){
        if (sInstance == null) {
            synchronized (BrawlerDatabase.class){
                if (sInstance == null) {
                    sInstance = buildDatabase(context.getApplicationContext());
                    sInstance.updateDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private void updateDatabaseCreated(Context applicationContext) {
        if (applicationContext.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated();
        }
    }

    public MutableLiveData<Boolean> getDatabaseCreated() {
        return mIsDatabaseCreated;
    }

    private void setDatabaseCreated() {
        mIsDatabaseCreated.postValue(true);
    }

    private static BrawlerDatabase buildDatabase(final Context applicationContext) {
        return Room.databaseBuilder(applicationContext, BrawlerDatabase.class, DATABASE_NAME)
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        BrawlerDatabase.getInstance(applicationContext).setDatabaseCreated();
                    }
                })
                .build();
    }


}
