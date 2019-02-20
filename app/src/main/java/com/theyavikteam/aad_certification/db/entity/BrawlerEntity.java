package com.theyavikteam.aad_certification.db.entity;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(tableName = "brawlers", primaryKeys = "id")
public class BrawlerEntity {
    @NonNull
    private String id;
    private String name;
    private String rarity;
    private String color;

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
