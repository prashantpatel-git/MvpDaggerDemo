package com.prashant.mvpdaggerdemo.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by PRASHANT on 02-07-2015.
 */
public final class LoadingDialog {

    private static ProgressDialog progressDialog;
    private static LoadingDialog loadingDialog;


    public static LoadingDialog getInstance(Context context) {

        if (loadingDialog == null) {
            if (loadingDialog == null) {
                loadingDialog = new LoadingDialog();
                progressDialog = new ProgressDialog(context);
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
            }
        }
        return loadingDialog;
    }

    public void show(String message) {

        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
        if (message != null && !message.isEmpty())
            progressDialog.setMessage(message);
    }

    public void show(String title, String message) {
        if (message != null && !message.isEmpty())
            progressDialog.setMessage(message);

        if (title != null && !title.isEmpty())
            progressDialog.setTitle(title);

        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    public void hide() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }

    public void setCancelable(boolean cancelable) {
        progressDialog.setCancelable(cancelable);
    }

    public void setLoadingMessage(String message) {
        progressDialog.setMessage(message);
    }

    public boolean isDialogShowing() {
        return progressDialog.isShowing();
    }
}
