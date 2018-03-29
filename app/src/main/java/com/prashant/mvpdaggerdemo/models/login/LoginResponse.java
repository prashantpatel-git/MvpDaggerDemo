package com.prashant.mvpdaggerdemo.models.login;

import com.google.gson.annotations.SerializedName;
import com.prashant.mvpdaggerdemo.models.User;

/**
 * Created by Prashant on 06/02/18.
 */

public class LoginResponse {

    @SerializedName("error")
    boolean error = false;

    @SerializedName("status")
    int status = -1;

    @SerializedName("message")
    String message = "Something went wrong, please try again!";

    @SerializedName("result")
    User result;

    public boolean isSuccess() {
        return status == 200;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getResult() {
        return result;
    }

    public void setResult(User result) {
        this.result = result;
    }
}
