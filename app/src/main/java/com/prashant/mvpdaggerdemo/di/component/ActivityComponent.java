package com.prashant.mvpdaggerdemo.di.component;

import com.prashant.mvpdaggerdemo.di.module.ActivityModule;
import com.prashant.mvpdaggerdemo.di.scope.ActivityScope;
import com.prashant.mvpdaggerdemo.login.LoginActivity;

import dagger.Component;

/**
 * Created by Prashant on 06/02/18.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    public void inject(LoginActivity activity);


}
