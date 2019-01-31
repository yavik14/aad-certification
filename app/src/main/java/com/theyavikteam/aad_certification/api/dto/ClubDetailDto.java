package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClubDetailDto extends ClubDto {
    @SerializedName("region")
    String region;
    @SerializedName("description")
    String description;
    @SerializedName("membersCount")
    Integer membersCount;
    @SerializedName("members")
    List<MemberDto> members;
}
