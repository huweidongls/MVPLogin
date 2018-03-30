package com.a99zan.mvplogin.model;

import com.a99zan.mvplogin.presenter.ILoginPresenter;

/**
 * Created by 99zan on 2018/3/30.
 */

public class LoginModel implements ILoginModel {

    private ILoginPresenter iLoginPresenter;

    public LoginModel (ILoginPresenter loginPresenter){
        iLoginPresenter = loginPresenter;
    }

    @Override
    public void loginToServer() {
        iLoginPresenter.loginSuccess();
    }
}
