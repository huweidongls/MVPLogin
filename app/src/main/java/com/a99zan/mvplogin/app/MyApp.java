package com.a99zan.mvplogin.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.vise.xsnow.http.ViseHttp;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 99zan on 2018/4/4.
 */

public class MyApp extends Application {

    private List<Activity> mList = new LinkedList<Activity>();
    private static MyApp instance;

    public static Context getAppContext() {
        return instance;
    }

    public MyApp() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        Utils.init(this);
//        instance = this;
        ViseHttp.init(this);
        ViseHttp.CONFIG()
                //配置请求主机地址
                .baseUrl("http://192.168.0.236/");
    }

    public synchronized static MyApp getInstance() {
        if (null == instance) {
            instance = new MyApp();
        }
        return instance;
    }

    // add Activity
    public void addActivity(Activity activity) {
        mList.add(activity);
    }

    public void exit() {
        try {
            for (Activity activity : mList) {
                if (activity != null)
                    activity.finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }
}

