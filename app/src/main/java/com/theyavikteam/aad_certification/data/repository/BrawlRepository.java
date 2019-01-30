package com.theyavikteam.aad_certification.data.repository;

import com.theyavikteam.aad_certification.data.repository.datasource.BrawlCacheDataSource;
import com.theyavikteam.aad_certification.data.repository.datasource.BrawlWsDataSource;
import com.theyavikteam.aad_certification.domain.bo.UserBo;

public class BrawlRepository {

    private BrawlWsDataSource wsDataSource;
    private BrawlCacheDataSource cacheDataSource;

    public BrawlRepository() {
        wsDataSource = new BrawlWsDataSource();
        cacheDataSource = new BrawlCacheDataSource(30);
    }

    public void getUserByTag(final String tag, final RepositoryCallback<UserBo> callback) {
        cacheDataSource.getUserByTag(tag, new RepositoryCallback<UserBo>() {
            @Override
            public void onSuccess(UserBo response) {
                callback.onSuccess(response);
            }

            @Override
            public void onError(String errorMessage) {
                wsDataSource.getUserByTag(tag, new RepositoryCallback<UserBo>() {
                    @Override
                    public void onSuccess(UserBo response) {
                        cacheDataSource.saveData(tag, response);
                        callback.onSuccess(response);
                    }

                    @Override
                    public void onError(String errorMessage) {
                        callback.onError(errorMessage);
                    }
                });
            }
        });
    }

    public interface RepositoryCallback<T> {
        void onSuccess(T response);

        void onError(String errorMessage);
    }

}
