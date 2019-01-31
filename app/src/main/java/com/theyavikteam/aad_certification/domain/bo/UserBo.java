package com.theyavikteam.aad_certification.domain.bo;

import java.io.Serializable;
import java.util.List;

public class UserBo implements Serializable {

    private String tag;
    private String name;
    private Integer avatarId;
    private Integer level;
    private String experienceToNextLevel;
    private Integer currentTrophies;
    private Integer maxTrophies;
    private Integer victories;
    private Integer soloShowdownVictories;
    private Integer duoShowdownVictories;
    private String bestTimeAsBoss;
    private String bestRoboRumbleTime;
    private String division;
    private ClubBo clubBo;
    private List<BrawlerBo> brawlers;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    public void setExperienceToNextLevel(String experienceToNextLevel) {
        this.experienceToNextLevel = experienceToNextLevel;
    }

    public Integer getCurrentTrophies() {
        return currentTrophies;
    }

    public void setCurrentTrophies(Integer currentTrophies) {
        this.currentTrophies = currentTrophies;
    }

    public Integer getMaxTrophies() {
        return maxTrophies;
    }

    public void setMaxTrophies(Integer maxTrophies) {
        this.maxTrophies = maxTrophies;
    }

    public Integer getVictories() {
        return victories;
    }

    public void setVictories(Integer victories) {
        this.victories = victories;
    }

    public Integer getSoloShowdownVictories() {
        return soloShowdownVictories;
    }

    public void setSoloShowdownVictories(Integer soloShowdownVictories) {
        this.soloShowdownVictories = soloShowdownVictories;
    }

    public Integer getDuoShowdownVictories() {
        return duoShowdownVictories;
    }

    public void setDuoShowdownVictories(Integer duoShowdownVictories) {
        this.duoShowdownVictories = duoShowdownVictories;
    }

    public String getBestTimeAsBoss() {
        return bestTimeAsBoss;
    }

    public void setBestTimeAsBoss(String bestTimeAsBoss) {
        this.bestTimeAsBoss = bestTimeAsBoss;
    }

    public String getBestRoboRumbleTime() {
        return bestRoboRumbleTime;
    }

    public void setBestRoboRumbleTime(String bestRoboRumbleTime) {
        this.bestRoboRumbleTime = bestRoboRumbleTime;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ClubBo getClubBo() {
        return clubBo;
    }

    public void setClubBo(ClubBo clubBo) {
        this.clubBo = clubBo;
    }

    public List<BrawlerBo> getBrawlers() {
        return brawlers;
    }

    public void setBrawlers(List<BrawlerBo> brawlers) {
        this.brawlers = brawlers;
    }
}
