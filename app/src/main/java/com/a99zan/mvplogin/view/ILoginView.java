package com.a99zan.mvplogin.view;

/**
 * Created by 99zan on 2018/3/30.
 */

/**
 * 登录
 */
public interface ILoginView {
    String getUserName();
    String getPassWord();
    void showLoginSuccess();
    void showLoginFail();
    void showLoginInfo(String str);
}
