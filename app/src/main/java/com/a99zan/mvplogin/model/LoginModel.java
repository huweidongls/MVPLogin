package com.a99zan.mvplogin.model;

import com.a99zan.mvplogin.bean.LoginBean;
import com.a99zan.mvplogin.presenter.ILoginPresenter;
import com.a99zan.mvplogin.utils.HttpUtil;
import com.google.gson.Gson;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by 99zan on 2018/3/30.
 */

public class LoginModel implements ILoginModel {

    private ILoginPresenter iLoginPresenter;

    public LoginModel (ILoginPresenter loginPresenter){
        iLoginPresenter = loginPresenter;
    }

    @Override
    public void loginToServer(String name, String pwd) {
        String url = "login.php?name="+name+"&pwd="+pwd;
        HttpUtil.getInstance().rxGet(url, new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String value) {
                Gson gson = new Gson();
                LoginBean loginBean = new LoginBean();
                loginBean = gson.fromJson(value, LoginBean.class);
                iLoginPresenter.loginSuccess(loginBean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
