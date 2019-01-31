package com.theyavikteam.aad_certification.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {

    private static Retrofit clientInstance = null;

    public static Retrofit getClient() {
        if (clientInstance == null) {
            clientInstance = new Retrofit.Builder()
                    .baseUrl("https://statsbrawl.com/api/")
                    .client(HttpClientConfiguration.INSTANCE.okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return clientInstance;
    }

    public enum HttpClientConfiguration {
        INSTANCE;

        private OkHttpClient okHttpClient;

        HttpClientConfiguration() {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .build();
        }
    }
}
