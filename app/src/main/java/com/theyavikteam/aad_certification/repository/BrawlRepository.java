package com.theyavikteam.aad_certification.repository;

import android.arch.lifecycle.LiveData;

import com.theyavikteam.aad_certification.BrawlerApplication;
import com.theyavikteam.aad_certification.db.BrawlerDatabase;
import com.theyavikteam.aad_certification.repository.datasource.BrawlCacheDataSource;
import com.theyavikteam.aad_certification.repository.datasource.BrawlWsDataSource;
import com.theyavikteam.aad_certification.domain.bo.UserBo;

public class BrawlRepository {

    private BrawlWsDataSource wsDataSource;
    private BrawlCacheDataSource cacheDataSource;
    private BrawlerDatabase dbSource;

    private LiveData<UserBo> mUser;

    public BrawlRepository() {
        wsDataSource = new BrawlWsDataSource();
        cacheDataSource = new BrawlCacheDataSource(30);
        dbSource = BrawlerDatabase.getInstance(BrawlerApplication.getApplication());

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
