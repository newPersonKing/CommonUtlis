package com.temp.gycommondemo;

import android.app.Application;

import com.temp.commonutil.Utils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
