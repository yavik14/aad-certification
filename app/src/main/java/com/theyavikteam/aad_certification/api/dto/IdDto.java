package com.theyavikteam.aad_certification.api.dto;

import com.google.gson.annotations.SerializedName;

public class IdDto {
    @SerializedName("high")
    private Integer high;
    @SerializedName("low")
    private Integer low;

    public Integer getHigh() {
        return high;
    }

    public Integer getLow() {
        return low;
    }
}
