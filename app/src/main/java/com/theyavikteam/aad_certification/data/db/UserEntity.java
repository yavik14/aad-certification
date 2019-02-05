package com.theyavikteam.aad_certification.data.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "users", foreignKeys = @ForeignKey(entity = ClubEntity.class,
        parentColumns = "tag",
        childColumns = "clubTag",
        onDelete = CASCADE))
public class UserEntity {

    @PrimaryKey
    @NonNull
    private String tag;
    private String name;
    @ColumnInfo(name = "avatar_id")
    private Integer avatarId;
    private Integer level;
    private String experience;
    @ColumnInfo(name = "current_trophies")
    private Integer currentTrophies;
    @ColumnInfo(name = "max_trophies")
    private Integer maxTrophies;
    private Integer victories;
    @ColumnInfo(name = "solo_showdown_victories")
    private Integer soloShowdownVictories;
    @ColumnInfo(name = "duo_showdown_victories")
    private Integer duoShowdownVictories;
    @ColumnInfo(name = "best_robot_rumble_time")
    private String bestRobotRumbleTime;
    private String division;
    @ColumnInfo(name = "club_tag")
    private String clubTag;

    @NonNull
    public String getTag() {
        return tag;
    }

    public void setTag(@NonNull String tag) {
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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

    public String getBestRobotRumbleTime() {
        return bestRobotRumbleTime;
    }

    public void setBestRobotRumbleTime(String bestRobotRumbleTime) {
        this.bestRobotRumbleTime = bestRobotRumbleTime;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getClubTag() {
        return clubTag;
    }

    public void setClubTag(String clubTag) {
        this.clubTag = clubTag;
    }
}
