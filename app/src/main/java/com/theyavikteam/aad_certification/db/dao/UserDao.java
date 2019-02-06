package com.theyavikteam.aad_certification.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.theyavikteam.aad_certification.db.entity.UserEntity;

import java.util.List;

@Dao
public abstract class UserDao implements BaseDao<UserEntity>{

    @Query("SELECT * from users WHERE tag = :tag")
    abstract LiveData<UserEntity> getUserByTag(String tag);

    @Query("SELECT * from users WHERE club_tag = :clubTag")
    abstract LiveData<List<UserEntity>> getUserOfClub(String clubTag);
}
