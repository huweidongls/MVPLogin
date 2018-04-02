package com.a99zan.mvplogin.presenter;

import android.util.Log;

import com.a99zan.mvplogin.bean.LoginBean;
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
        String name = iLoginView.getUserName();
        String pwd = iLoginView.getPassWord();
        Log.e("111presenter", name+"--------"+pwd);
        loginModel.loginToServer(name, pwd);
    }

    @Override
    public void loginSuccess(LoginBean loginBean) {
        iLoginView.showLoginSuccess();
        iLoginView.showLoginInfo(loginBean.getMsg().getInfo());
    }

    @Override
    public void loginFail() {
        iLoginView.showLoginFail();
    }
}
