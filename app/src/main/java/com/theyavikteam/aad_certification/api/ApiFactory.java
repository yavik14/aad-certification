package com.theyavikteam.aad_certification.api;

public class ApiFactory {

    public static BrawlStatsApi createBrawlStatsApi(){
        return HttpClient.getClient().create(BrawlStatsApi.class);
    }

}
