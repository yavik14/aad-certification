package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MemberDto implements Serializable {
    @SerializedName("id")
    IdDto id;
    @SerializedName("tag")
    String tag;
    @SerializedName("name")
    String name;
    @SerializedName("role")
    String role;
    @SerializedName("expLevel")
    Integer expLevel;
    @SerializedName("trophies")
    Integer trophies;
    @SerializedName("avatarId")
    String avatar;

}
