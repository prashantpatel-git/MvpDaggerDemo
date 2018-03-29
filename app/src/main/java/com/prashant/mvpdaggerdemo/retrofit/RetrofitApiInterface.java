package com.prashant.mvpdaggerdemo.retrofit;


import com.prashant.mvpdaggerdemo.models.User;
import com.prashant.mvpdaggerdemo.models.login.LoginResponse;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/**
 * Created by Prashant on 15/12/17.
 */

public interface RetrofitApiInterface {

    @POST("login")
    public Observable<LoginResponse> performLogin(
            @Body User user,
            @HeaderMap HashMap<String, String> headerMap
    );
}
