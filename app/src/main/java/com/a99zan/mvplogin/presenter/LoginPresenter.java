package com.a99zan.mvplogin.presenter;

import com.a99zan.mvplogin.model.LoginModel;
import com.a99zan.mvplogin.view.ILoginView;

/**
 * Created by 99zan on 2018/3/30.
 */

public class LoginPresenter implements ILoginPresenter {

    private ILoginView iLoginView;
    private LoginModel loginModel;

    public LoginPresenter(ILoginView loginView){
        iLoginView  =loginView;
        loginModel = new LoginModel(this);
    }

    @Override
    public void login() {
        loginModel.loginToServer();
    }

    @Override
    public void loginSuccess() {
        iLoginView.showLoginSuccess();
    }

    @Override
    public void loginFail() {
        iLoginView.showLoginFail();
    }
}
