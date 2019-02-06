package com.theyavikteam.aad_certification.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user_brawler_join",
        primaryKeys = {"brawlerId", "userTag"},
        foreignKeys = {
                @ForeignKey(entity = BrawlerEntity.class,
                        parentColumns = "id",
                        childColumns = "brawlerId"),
                @ForeignKey(entity = UserEntity.class,
                        parentColumns = "tag",
                        childColumns = "userTag")
        })
public class UserBrawlerEntity {
    @NonNull
    private String brawlerId;
    private String brawlerName;
    @NonNull
    private String userTag;
    private Integer trophies;
    @ColumnInfo(name = "max_trophies")
    private Integer maxTrophies;
    private Integer power;
    private Integer level;
    private Integer rank;

    @NonNull
    public String getBrawlerId() {
        return brawlerId;
    }

    public void setBrawlerId(@NonNull String brawlerId) {
        this.brawlerId = brawlerId;
    }

    public String getBrawlerName() {
        return brawlerName;
    }

    public void setBrawlerName(String brawlerName) {
        this.brawlerName = brawlerName;
    }

    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    public Integer getMaxTrophies() {
        return maxTrophies;
    }

    public void setMaxTrophies(Integer maxTrophies) {
        this.maxTrophies = maxTrophies;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
