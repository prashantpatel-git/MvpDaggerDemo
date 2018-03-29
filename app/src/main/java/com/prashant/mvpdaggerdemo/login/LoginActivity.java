package com.prashant.mvpdaggerdemo.login;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.prashant.mvpdaggerdemo.R;
import com.prashant.mvpdaggerdemo.base.BaseActivity;
import com.prashant.mvpdaggerdemo.databinding.ActivityLoginBinding;
import com.prashant.mvpdaggerdemo.main.MainActivity;
import com.prashant.mvpdaggerdemo.utils.AnimationUtils;
import com.prashant.mvpdaggerdemo.utils.ToastUtils;
import com.prashant.mvpdaggerdemo.utils.ValidationUtils;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView {


    final int animationDuration = 300;
    @Inject
    LoginContract.LoginPresenter<LoginContract.LoginView> presenter;
    EditText emailEt, passwordEt;
    TextView loginTv, loginLabelTv;
    //Button loginBtn;
    ViewGroup rootView, btnContainerLayout;
    ProgressBar loginPb;
    int loginBtnOriginalWidth = 0;
    View bottomSheetView;
    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);
        presenter.onAttach(this);

        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.loginMainLayout.setLoginView(this);

        rootView = findViewById(R.id.login_container_layout);
        emailEt = findViewById(R.id.login_email_et);
        passwordEt = findViewById(R.id.login_password_et);
        btnContainerLayout = findViewById(R.id.login_btn_container_layout);
        loginTv = findViewById(R.id.login_status_tv);
        loginLabelTv = findViewById(R.id.login_label_tv);
        //loginBtn = findViewById(R.id.login_btn);
        loginPb = findViewById(R.id.login_progress_bar);
        bottomSheetView = findViewById(R.id.login_bottom_sheet);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetView);
    }

    @Override
    public void onLoginSuccess() {
        ToastUtils.showToast(this, "Login Successful!");
    }

    @Override
    public void onLoginError(String message) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                revertAnimateBtn();
            }
        }, 3000);
        ToastUtils.showToast(this, message);
    }

    @Override
    public void onValidationError(int validationType, String errorMsg) {

        switch (validationType) {
            case ValidationUtils.INVALID_EMAIL_ID:
                emailEt.setError(errorMsg);
                break;

            case ValidationUtils.INVALID_PASSWORD:
                passwordEt.setError(errorMsg);

        }
    }

    @Override
    public void onLoginBtnClick() {

        emailEt.setError(null);
        passwordEt.setError(null);

        //presenter.attemptLogin(emailEt.getText().toString(), passwordEt.getText().toString());
        startActivity(new Intent(LoginActivity.this, MainActivity.class));

    }

    @Override
    public void onLoadingStart() {
        animateBtn();
    }

    @Override
    public void onLoadingFinish() {

    }

    private void animateBtn() {

        loginBtnOriginalWidth = btnContainerLayout.getWidth();

        int toWidth = (int) getResources().getDimension(R.dimen.btn_height);
        int toHeight = toWidth;

        AnimationUtils.startValueAnimator(btnContainerLayout, toWidth, toHeight, animationDuration);

        showLoadingProgress();
    }

    private void revertAnimateBtn() {

        int toHeight = (int) getResources().getDimension(R.dimen.btn_height);

        AnimationUtils.startValueAnimator(btnContainerLayout, loginBtnOriginalWidth, toHeight, animationDuration);

        hideLoadingProgress();
    }

    private void showLoadingProgress() {
        AnimationUtils.startAlphaAnim(loginTv, 0f, View.INVISIBLE, animationDuration);
        AnimationUtils.startAlphaAnim(loginPb, 1f, View.VISIBLE, animationDuration);
    }

    private void hideLoadingProgress() {
        AnimationUtils.startAlphaAnim(loginTv, 1f, View.VISIBLE, animationDuration);
        AnimationUtils.startAlphaAnim(loginPb, 0f, View.INVISIBLE, animationDuration);

    }

    @Override
    protected void onDestroy() {
        presenter.onDetach();
        presenter = null;
        super.onDestroy();
    }

}

