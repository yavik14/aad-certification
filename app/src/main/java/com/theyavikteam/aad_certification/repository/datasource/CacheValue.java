package com.theyavikteam.aad_certification.repository.datasource;

import java.util.Calendar;

public class CacheValue<T> {

    private long timestamp;
    private T value;

    public CacheValue(T value) {
        this.value = value;
        timestamp = Calendar.getInstance().getTimeInMillis();
    }

    public T getValue() {
        return value;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
