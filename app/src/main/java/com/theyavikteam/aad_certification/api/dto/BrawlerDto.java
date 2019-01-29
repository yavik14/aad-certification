package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BrawlerDto implements Serializable {
    @SerializedName("name")
    private String name;
    @SerializedName("hasSkin")
    private boolean hasSkin;
    @SerializedName("trophies")
    private Integer trophies;
    @SerializedName("highestTrophies")
    private Integer highestTrophies;
    @SerializedName("power")
    private Integer power;
    @SerializedName("level")
    private Integer level;
    @SerializedName("rank")
    private Integer rank;
    @SerializedName("rarity")
    private String rarity;
    @SerializedName("color")
    private String color;

    public String getName() {
        return name;
    }

    public boolean isHasSkin() {
        return hasSkin;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public Integer getHighestTrophies() {
        return highestTrophies;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getRank() {
        return rank;
    }

    public String getRarity() {
        return rarity;
    }

    public String getColor() {
        return color;
    }
}
