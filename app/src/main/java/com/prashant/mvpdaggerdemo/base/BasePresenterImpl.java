package com.prashant.mvpdaggerdemo.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Prashant on 06/02/18.
 */

public class BasePresenterImpl<V extends BaseContract.BaseView> implements BaseContract.BasePresenter<V> {

    V view;
    CompositeDisposable compositeDisposable;

    public BasePresenterImpl(CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        compositeDisposable.dispose();
        compositeDisposable = null;
    }

    public V getView() {
        return view;
    }

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }
}
