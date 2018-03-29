package com.prashant.mvpdaggerdemo.retrofit;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by Prashant on 02/02/18.
 */

public class RetrofitService {

    RetrofitApiInterface retrofitApiInterface;
    //Retrofit retrofit;

    @Inject
    public RetrofitService(Retrofit retrofit) {
        this.retrofitApiInterface = retrofit.create(RetrofitApiInterface.class);
    }

    public RetrofitApiInterface getApiInterface() {

        return retrofitApiInterface;
    }


}
