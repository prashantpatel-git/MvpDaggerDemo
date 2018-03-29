package com.prashant.mvpdaggerdemo.login;

import com.prashant.mvpdaggerdemo.base.BaseContract;
import com.prashant.mvpdaggerdemo.utils.ValidationUtils;

/**
 * Created by Prashant on 06/02/18.
 */

public class LoginContract {

    public interface LoginPresenter<V extends LoginView> extends BaseContract.BasePresenter<V>{

        void attemptLogin(String email, String password);

    }

    public interface LoginView extends BaseContract.BaseView{

        void onLoginSuccess();

        void onLoginError(String message);

        void onValidationError(@ValidationUtils.ValidationType int validationType, String errorMsg);

        void onLoginBtnClick();

        void onLoadingStart();

        void onLoadingFinish();
    }
}
