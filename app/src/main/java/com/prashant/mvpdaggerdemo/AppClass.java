package com.prashant.mvpdaggerdemo;

import android.app.Application;

import com.prashant.mvpdaggerdemo.di.component.AppComponent;
import com.prashant.mvpdaggerdemo.di.component.DaggerAppComponent;
import com.prashant.mvpdaggerdemo.di.module.AppModule;
import com.prashant.mvpdaggerdemo.di.module.NetworkModule;

import static com.prashant.mvpdaggerdemo.utils.UrlUtils.BASE_URL;

/**
 * Created by Prashant on 06/02/18.
 */

public class AppClass extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule(BASE_URL))
                .build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
