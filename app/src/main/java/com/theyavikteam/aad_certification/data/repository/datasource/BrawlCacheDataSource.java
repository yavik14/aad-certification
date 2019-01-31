package com.theyavikteam.aad_certification.data.repository.datasource;

import android.util.Log;

import com.theyavikteam.aad_certification.data.repository.BrawlRepository;
import com.theyavikteam.aad_certification.domain.bo.UserBo;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class BrawlCacheDataSource {

    private Map<String, CacheValue<UserBo>> cacheData;
    private long dirtyInMillis;

    public BrawlCacheDataSource(long timeInSeconds) {
        cacheData = new HashMap<>();
        dirtyInMillis = timeInSeconds * 1000;
    }

    public void saveData(String key, UserBo data) {
        cacheData.put(key, new CacheValue<>(data));
    }

    private boolean containsKey(String key) {
        return cacheData.containsKey(key);
    }

    private boolean isDirty(String key) {
        boolean isDirty = true;
        if (containsKey(key) && cacheData.get(key) != null) {
            isDirty = cacheData.get(key).getTimestamp() + dirtyInMillis  < Calendar.getInstance().getTimeInMillis();
        }
        return isDirty;
    }

    public void getUserByTag(String tag, BrawlRepository.RepositoryCallback<UserBo> callback) {
        if (containsKey(tag)) {
            CacheValue<UserBo> userFromCache = cacheData.get(tag);
            if (userFromCache != null && !isDirty(tag)) {
                Log.i(BrawlRepository.class.getSimpleName(), "From Cache");
                callback.onSuccess(userFromCache.getValue());
            }else {
                Log.i(BrawlRepository.class.getSimpleName(), "Dirty Cache");
                callback.onError("dirty cache");
            }
        } else {
            Log.i(BrawlRepository.class.getSimpleName(), "Without Cache");
            callback.onError("without cache");
        }
    }

}
