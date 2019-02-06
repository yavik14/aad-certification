package com.theyavikteam.aad_certification.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.theyavikteam.aad_certification.db.entity.ClubEntity;

@Dao
public abstract class ClubDao implements BaseDao<ClubEntity> {

    @Query("SELECT * from clubs WHERE tag = :tag")
    abstract LiveData<ClubEntity> getClubByTag(String tag);

}
