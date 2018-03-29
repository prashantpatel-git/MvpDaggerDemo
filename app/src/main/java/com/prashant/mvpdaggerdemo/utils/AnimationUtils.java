package com.prashant.mvpdaggerdemo.utils;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Prashant on 08/02/18.
 */

public class AnimationUtils {

    public static void startValueAnimator(final View viewToAnimate, int toWidth, int toHeight, int duration) {

        ValueAnimator widthAnimator = ValueAnimator.ofInt(viewToAnimate.getWidth(), toWidth);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams params = viewToAnimate.getLayoutParams();
                params.width = (int) valueAnimator.getAnimatedValue();
                viewToAnimate.setLayoutParams(params);
            }
        });

        ValueAnimator heightAnimator = ValueAnimator.ofInt(viewToAnimate.getHeight(), toHeight);
        heightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams params = viewToAnimate.getLayoutParams();
                params.height = (int) valueAnimator.getAnimatedValue();
                viewToAnimate.setLayoutParams(params);
            }
        });

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(duration);
        animatorSet.playTogether(widthAnimator, heightAnimator);
        animatorSet.start();
    }

    public static void startAlphaAnim(final View viewToAnimate, float alpha, int visibilityAfterAnim, int duration){
        viewToAnimate.animate()
                .alpha(alpha)
                .setDuration(duration)
                .start();
        viewToAnimate.setVisibility(visibilityAfterAnim);
    }

}
