package com.theyavikteam.aad_certification.repository.datasource;

import android.util.Log;

import com.theyavikteam.aad_certification.api.ApiFactory;
import com.theyavikteam.aad_certification.api.BrawlStatsApi;
import com.theyavikteam.aad_certification.api.dto.UserDto;
import com.theyavikteam.aad_certification.repository.BrawlRepository;
import com.theyavikteam.aad_certification.repository.mapper.UserMapper;
import com.theyavikteam.aad_certification.domain.bo.UserBo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrawlWsDataSource {
    private BrawlStatsApi brawlStatsApi;

    public BrawlWsDataSource() {
        brawlStatsApi = ApiFactory.createBrawlStatsApi();
    }

    public void getUserByTag(String tag, final BrawlRepository.RepositoryCallback<UserBo> callback) {
        brawlStatsApi.getUserByTag(tag).enqueue(new Callback<UserDto>() {
            @Override
            public void onResponse(Call<UserDto> call, Response<UserDto> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(UserMapper.dtoToBo(response.body()));
                    Log.i(BrawlRepository.class.getSimpleName(), "From Ws");
                } else {
                    String errorMessage = "Unexpected error";
                    callback.onError(errorMessage);
                    Log.i(BrawlRepository.class.getSimpleName(), errorMessage);
                }
            }

            @Override
            public void onFailure(Call<UserDto> call, Throwable t) {
                callback.onError(t.getMessage());
            }
        });
    }
}
