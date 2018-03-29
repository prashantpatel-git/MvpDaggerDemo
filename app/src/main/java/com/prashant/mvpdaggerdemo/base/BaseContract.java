package com.prashant.mvpdaggerdemo.base;

/**
 * Created by Prashant on 06/02/18.
 */

public class BaseContract {

    public interface BasePresenter<V extends BaseContract.BaseView> {

        void onAttach(V view);

        void onDetach();
    }

    public interface BaseView {

        void showLoading(String title, String loadingMessage);

        void hideLoading();

        boolean isNetworkAvailable();
    }
}
