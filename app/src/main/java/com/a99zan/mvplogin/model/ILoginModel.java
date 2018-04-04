package com.a99zan.mvplogin.model;

import android.content.Context;

/**
 * Created by 99zan on 2018/3/30.
 */

public interface ILoginModel {
    void loginToServer(Context context, String name, String pwd);
}
