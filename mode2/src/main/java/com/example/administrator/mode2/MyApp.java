package com.example.administrator.mode2;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by 张祺钒
 * on2017/8/4.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 默认设置为日间模式
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
    }
}
