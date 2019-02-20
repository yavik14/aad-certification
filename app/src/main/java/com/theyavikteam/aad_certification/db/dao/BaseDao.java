package com.theyavikteam.aad_certification.db.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

public interface BaseDao<T> {
    @Insert
    void insert(T... tEntities);
    @Update
    void update(T... tEntities);
    @Delete
    void delete(T... tEntities);
}
