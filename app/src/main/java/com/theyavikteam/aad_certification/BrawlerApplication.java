package com.theyavikteam.aad_certification;

import android.app.Application;

public class BrawlerApplication extends Application {

    private static BrawlerApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static BrawlerApplication getApplication() {
        return application;
    }
}
