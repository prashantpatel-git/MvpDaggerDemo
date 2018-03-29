package com.prashant.mvpdaggerdemo.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.prashant.mvpdaggerdemo.R;
import com.prashant.mvpdaggerdemo.base.BaseActivity;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends BaseActivity {

    TextView labelTv;
    FloatingActionButton floatingActionButton;
    View rootView;
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActivityTransition();

        labelTv = findViewById(R.id.main_label_tv);
        labelTv.setVisibility(View.GONE);

        floatingActionButton = findViewById(R.id.main_floating_btn);
        rootView = findViewById(R.id.main_root_view);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createRevealAnimation(floatingActionButton, rootView, labelTv);
            }
        });

        mainButton = findViewById(R.id.main_click_btn);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
                observable.map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) throws Exception {

                        if(integer%2 == 0){

                        }
                        return integer + "...";
                    }
                })
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<String>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(String value) {
                                Log.d("Rxjava", value);

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        });

            }
        });
    }

    void createRevealAnimation(View srcView, View destView, final View revealView) {
        int x = srcView.getLeft() + (srcView.getWidth() / 2);
        int y = srcView.getTop() + (srcView.getWidth() / 2);

        int startRadius = 0;
        int endRadius = (int) Math.hypot(destView.getWidth(), destView.getHeight());

        Animator anim;
        if (revealView.getVisibility() != View.VISIBLE) {
            anim = ViewAnimationUtils.createCircularReveal(revealView, x, y, startRadius, endRadius);
            revealView.setVisibility(View.VISIBLE);
        } else {
            anim = ViewAnimationUtils.createCircularReveal(revealView, x, y, endRadius, startRadius);
            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    revealView.setVisibility(View.INVISIBLE);

                }
            });
        }
        anim.setDuration(500);
        anim.start();
    }

    private void setActivityTransition() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
    }


}
