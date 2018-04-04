package com.a99zan.mvplogin.presenter;

import android.content.Context;

import com.a99zan.mvplogin.bean.LoginBean;

/**
 * Created by 99zan on 2018/3/30.
 */

public interface ILoginPresenter {
    void loginSuccess(LoginBean loginBean);
    void loginFail();
    void login(Context context);
}
