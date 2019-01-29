package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {
    @SerializedName("tag")
    private String tag;
    @SerializedName("id")
    private IdDto id;
    @SerializedName("name")
    private String name;
    @SerializedName("brawlersUnlocked")
    private Integer brawlersUnlocked;
    @SerializedName("victories")
    private Integer victories;
    @SerializedName("soloShowdownVictories")
    private Integer soloShowdownVictories;
    @SerializedName("duoShowdownVictories")
    private Integer duoShowdownVictories;
    @SerializedName("totalExp")
    private Integer experience;
    @SerializedName("expFmt")
    private String expFmt;
    @SerializedName("expLevel")
    private Integer level;
    @SerializedName("trophies")
    private Integer trophies;
    @SerializedName("highestTrophies")
    private Integer highestTrophies;
    @SerializedName("avatarId")
    private Integer avatar;
    @SerializedName("bestTimeAsBoss")
    private String bestTimeAsBoss;
    @SerializedName("bestRoboRumbleTime")
    private String bestRoboRumbleTime;
    @SerializedName("hasSkins")
    private boolean hasSkins;
    @SerializedName("club")
    private ClubDto club;
    @SerializedName("brawlers")
    private List<BrawlerDto> brawlers;
    @SerializedName("division")
    private String division;
    @SerializedName("nextDivision")
    private Integer nextDivision;
    @SerializedName("rank")
    private String rank;
    @SerializedName("percentage")
    private String percentage;

    public String getTag() {
        return tag;
    }

    public IdDto getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBrawlersUnlocked() {
        return brawlersUnlocked;
    }

    public Integer getVictories() {
        return victories;
    }

    public Integer getSoloShowdownVictories() {
        return soloShowdownVictories;
    }

    public Integer getDuoShowdownVictories() {
        return duoShowdownVictories;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getExpFmt() {
        return expFmt;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public Integer getHighestTrophies() {
        return highestTrophies;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public String getBestTimeAsBoss() {
        return bestTimeAsBoss;
    }

    public String getBestRoboRumbleTime() {
        return bestRoboRumbleTime;
    }

    public boolean isHasSkins() {
        return hasSkins;
    }

    public ClubDto getClub() {
        return club;
    }

    public List<BrawlerDto> getBrawlers() {
        return brawlers;
    }

    public String getDivision() {
        return division;
    }

    public Integer getNextDivision() {
        return nextDivision;
    }

    public String getRank() {
        return rank;
    }

    public String getPercentage() {
        return percentage;
    }
}
