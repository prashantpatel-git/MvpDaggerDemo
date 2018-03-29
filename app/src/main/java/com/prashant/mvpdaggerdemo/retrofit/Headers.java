package com.prashant.mvpdaggerdemo.retrofit;

import java.util.HashMap;

/**
 * Created by Prashant on 07/02/18.
 */

public final class Headers {

    public static HashMap<String, String> getDefaultHeader() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json;charset=UTF-8");
        return hashMap;
    }
}
