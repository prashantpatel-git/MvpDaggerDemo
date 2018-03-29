package com.prashant.mvpdaggerdemo.login;

import com.prashant.mvpdaggerdemo.base.BasePresenterImpl;
import com.prashant.mvpdaggerdemo.models.User;
import com.prashant.mvpdaggerdemo.models.login.LoginResponse;
import com.prashant.mvpdaggerdemo.retrofit.Headers;
import com.prashant.mvpdaggerdemo.retrofit.RetrofitApiInterface;
import com.prashant.mvpdaggerdemo.retrofit.RetrofitService;
import com.prashant.mvpdaggerdemo.utils.ValidationUtils;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Prashant on 06/02/18.
 */

public class LoginPresenterImpl<V extends LoginContract.LoginView> extends BasePresenterImpl<V> implements LoginContract.LoginPresenter<V> {

    RetrofitApiInterface apiInterface;
    //Retrofit retrofit;

    @Inject
    public LoginPresenterImpl(CompositeDisposable compositeDisposable, RetrofitService retrofitService) {
        super(compositeDisposable);
        this.apiInterface = retrofitService.getApiInterface();
        //this.retrofit = retrofit;
    }

    @Override
    public void attemptLogin(String email, String password) {
        if (!ValidationUtils.validateEmail(email))
            getView().onValidationError(ValidationUtils.INVALID_EMAIL_ID, "Invalid Email-Id!");
        else if (password.isEmpty())
            getView().onValidationError(ValidationUtils.INVALID_PASSWORD, "Password is required!");
        else if (getView().isNetworkAvailable()) {
            performLogin(email, password);
        }
    }

    private void performLogin(String email, String password) {

        User user = new User();
        user.setUsername(email);
        user.setPassword(password);
        user.setDeviceToken("1243124");

        DisposableObserver<LoginResponse> disposableObserver = new DisposableObserver<LoginResponse>() {
            @Override
            protected void onStart() {
                //getView().showLoading("Sign-In", "Signing you in, please wait...");
                getView().onLoadingStart();
                super.onStart();
            }

            @Override
            public void onNext(LoginResponse loginResponse) {
                if (loginResponse.isSuccess()) {
                    getView().onLoginSuccess();
                } else {
                    getView().onLoginError(loginResponse.getMessage());
                }
            }

            @Override
            public void onError(Throwable e) {
                getView().onLoginError("Something went wrong, please try again!");
                //getView().hideLoading();
            }

            @Override
            public void onComplete() {
                //getView().hideLoading();
            }
        };

        getCompositeDisposable().add(disposableObserver);
        apiInterface
                .performLogin(user, Headers.getDefaultHeader())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver);

    }
}
