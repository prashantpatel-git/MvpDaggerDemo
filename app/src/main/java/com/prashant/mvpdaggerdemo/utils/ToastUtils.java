package com.prashant.mvpdaggerdemo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Prashant on 06/02/18.
 */

public class ToastUtils {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
