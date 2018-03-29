package com.prashant.mvpdaggerdemo.utils;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by Prashant on 06/02/18.
 */

public class ValidationUtils {

    final static String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    public static final int INVALID_EMAIL_ID = 1;
    public static final int INVALID_PASSWORD = 2;

    public static boolean validateEmail(String email) {
        return email.matches(EMAIL_PATTERN) && !email.isEmpty();

    }

    @IntDef({INVALID_EMAIL_ID, INVALID_PASSWORD})
    @Retention(SOURCE)
    public @interface ValidationType {
    }
}
