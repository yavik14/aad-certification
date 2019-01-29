package com.theyavikteam.aad_certification.data.repository.datasource;

import com.theyavikteam.aad_certification.api.ApiFactory;
import com.theyavikteam.aad_certification.api.BrawlStatsApi;
import com.theyavikteam.aad_certification.api.dto.UserDto;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrawlRepository {

    private BrawlStatsApi brawlStatsApi;

    public BrawlRepository() {
        brawlStatsApi = ApiFactory.createBrawlStatsApi();
    }

    public void getUserByTag(String tag, final RepositoryCallback<UserDto> callback) {
        brawlStatsApi.getUserByTag(tag).enqueue(new Callback<UserDto>() {
            @Override
            public void onResponse(Call<UserDto> call, Response<UserDto> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<UserDto> call, Throwable t) {
                callback.onError(t.getMessage());
            }
        });
    }

    public interface RepositoryCallback<T> {
        void onSuccess(T response);

        void onError(String errorMessage);
    }

}
