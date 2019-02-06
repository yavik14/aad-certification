package com.theyavikteam.aad_certification.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.theyavikteam.aad_certification.db.entity.UserBrawlerEntity;

import java.util.List;

@Dao
public abstract class UserBrawlerJoinDao implements BaseDao<UserBrawlerEntity>{

    @Query("SELECT * " +
            "FROM users " +
            "INNER JOIN user_brawler_join " +
            "ON users.tag = user_brawler_join.userTag " +
            "WHERE userTag= :userTag")
    abstract LiveData<List<UserBrawlerEntity>> getUserBrawlers(String userTag);

}
