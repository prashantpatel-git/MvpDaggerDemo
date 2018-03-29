package com.prashant.mvpdaggerdemo.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.prashant.mvpdaggerdemo.AppClass;
import com.prashant.mvpdaggerdemo.di.component.ActivityComponent;
import com.prashant.mvpdaggerdemo.di.component.DaggerActivityComponent;
import com.prashant.mvpdaggerdemo.di.module.ActivityModule;
import com.prashant.mvpdaggerdemo.utils.ConnectivityUtils;
import com.prashant.mvpdaggerdemo.utils.LoadingDialog;
import com.prashant.mvpdaggerdemo.utils.ToastUtils;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BaseActivity extends AppCompatActivity implements BaseContract.BaseView {


    LoadingDialog loadingDialog;

    @Inject
    CompositeDisposable compositeDisposable;

    ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityComponent = DaggerActivityComponent
                .builder()
                .activityModule(new ActivityModule(this))
                //    .networkModule(new NetworkModule(BASE_URL))
                .appComponent(((AppClass) getApplication()).getAppComponent())
                .build();

        loadingDialog = LoadingDialog.getInstance(this);
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    @Override
    public void showLoading(String title, String loadingMsg) {
        loadingDialog.show(title, loadingMsg);

    }

    @Override
    public void hideLoading() {
        loadingDialog.hide();
    }

    @Override
    public boolean isNetworkAvailable() {
        if (!ConnectivityUtils.isConnectedToInternet(this)) {
            ToastUtils.showToast(this, "No network connection!");
            return false;
        }
        return true;
    }

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }

}
