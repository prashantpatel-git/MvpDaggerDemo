package com.prashant.mvpdaggerdemo.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Prashant on 06/02/18.
 */

@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
