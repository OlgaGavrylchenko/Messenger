package com.example.android.letschatapp.main;

import android.app.Application;

import com.example.android.letschatapp.utils.PreferenceUtils;
import com.sendbird.android.SendBird;

/**
 * Created by ig097 on 3/14/2018.
 */

public class BaseApplication extends Application {

    private static final String APP_ID = "B5969EF6-CACA-4D9A-8B52-BC7A7081E1F7"; // US-1 Demo
    public static final String VERSION = "3.0.39";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());
    }
}
