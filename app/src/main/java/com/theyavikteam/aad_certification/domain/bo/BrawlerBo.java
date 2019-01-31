package com.theyavikteam.aad_certification.domain.bo;

import java.io.Serializable;

public class BrawlerBo implements Serializable {
    private String name;
    private Integer trophies;
    private Integer maxTrophies;
    private Integer power;
    private Integer level;
    private Integer rank;
    private String rarity;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
