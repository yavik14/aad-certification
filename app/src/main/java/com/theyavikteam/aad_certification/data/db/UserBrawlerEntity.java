package com.theyavikteam.aad_certification.data.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "user_brawler_join",
        primaryKeys = {"brawlerName", "userTag"},
        foreignKeys = {
                @ForeignKey(entity = BrawlerEntity.class,
                        parentColumns = "name",
                        childColumns = "brawlerName"),
                @ForeignKey(entity = UserEntity.class,
                        parentColumns = "tag",
                        childColumns = "userTag")
        })
public class UserBrawlerEntity {
    private String brawlerName;
    private String userTag;
    private Integer trophies;
    @ColumnInfo(name = "max_trophies")
    private Integer maxTrophies;
    private Integer power;
    private Integer level;
    private Integer rank;

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
