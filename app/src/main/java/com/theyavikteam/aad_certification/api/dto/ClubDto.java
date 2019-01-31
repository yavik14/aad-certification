package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ClubDto implements Serializable {
    @SerializedName("tag")
    String tag;
    @SerializedName("id")
    IdDto id;
    @SerializedName("name")
    String name;
    @SerializedName("badgeId")
    String badgeId;
    @SerializedName("badgeUrl")
    String badgeUrl;
    @SerializedName("status")
    String status;
    @SerializedName("onlineMembers")
    Integer onlineMembers;
    @SerializedName("trophies")
    Integer trophies;
    @SerializedName("requiredTrophies")
    Integer requieredTrophies;

}
