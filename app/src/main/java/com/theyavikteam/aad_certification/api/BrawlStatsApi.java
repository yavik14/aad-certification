package com.theyavikteam.aad_certification.api;

import com.theyavikteam.aad_certification.api.dto.ClubDetailDto;
import com.theyavikteam.aad_certification.api.dto.UserDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BrawlStatsApi {

    @GET("players/{userTag}")
    Call<UserDto> getUserByTag(@Path("userTag") String userTag);

    @GET("clubs/{clubTag}")
    Call<ClubDetailDto> getClubByTag(@Path("clubTag") String clubTag);

}
