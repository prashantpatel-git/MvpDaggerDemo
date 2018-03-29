package com.prashant.mvpdaggerdemo.di.module;

import android.app.Application;

import com.prashant.mvpdaggerdemo.retrofit.RetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Prashant on 06/02/18.
 */

@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Application getApplication() {
        return application;
    }

    @Singleton
    @Provides
    public RetrofitService provideRetrofitService(Retrofit retrofit) {
        return new RetrofitService(retrofit);
    }

}
