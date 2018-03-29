package com.prashant.mvpdaggerdemo.di.module;

import android.app.Activity;
import android.content.Context;

import com.prashant.mvpdaggerdemo.di.scope.ActivityScope;
import com.prashant.mvpdaggerdemo.login.LoginContract;
import com.prashant.mvpdaggerdemo.login.LoginPresenterImpl;
import com.prashant.mvpdaggerdemo.retrofit.RetrofitService;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Prashant on 06/02/18.
 */

@Module
public class ActivityModule {

    Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    public Activity getActivity() {
        return activity;
    }

    @ActivityScope
    @Provides
    public Context getContext() {
        return activity;
    }

    @ActivityScope
    @Provides
    public CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

/*
    @ActivityScope
    @Provides
    public LoginContract.LoginView provideLoginView() {
        return (LoginContract.LoginView) activity;
    }
*/

    @ActivityScope
    @Provides
    public LoginContract.LoginPresenter<LoginContract.LoginView> provideLoginPresenter(CompositeDisposable compositeDisposable, RetrofitService retrofitService) {
        return new LoginPresenterImpl<LoginContract.LoginView>(compositeDisposable, retrofitService);
    }

}
