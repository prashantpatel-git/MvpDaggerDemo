package com.prashant.mvpdaggerdemo.di.component;

import android.app.Application;

import com.prashant.mvpdaggerdemo.di.module.AppModule;
import com.prashant.mvpdaggerdemo.di.module.NetworkModule;
import com.prashant.mvpdaggerdemo.retrofit.RetrofitService;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Prashant on 06/02/18.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(Application application);

    Retrofit retrofit();
    RetrofitService retrofitService();

}
