package com.a99zan.mvplogin.model;

import android.content.Context;
import android.util.Log;

import com.a99zan.mvplogin.bean.LoginBean;
import com.a99zan.mvplogin.presenter.ILoginPresenter;
import com.a99zan.mvplogin.utils.AObserver;
import com.a99zan.mvplogin.utils.HttpUtil;
import com.google.gson.Gson;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.callback.ACallback;

/**
 * Created by 99zan on 2018/3/30.
 */

public class LoginModel implements ILoginModel {

    private ILoginPresenter iLoginPresenter;

    public LoginModel(ILoginPresenter loginPresenter) {
        iLoginPresenter = loginPresenter;
    }

    @Override
    public void loginToServer(Context context, String name, String pwd) {
//        String url = "login.php?name=" + name + "&pwd=" + pwd;
//        HttpUtil.getInstance().rxGet(url, new AObserver<String>() {
//            @Override
//            public void onNext(String value) {
//                Gson gson = new Gson();
//                LoginBean loginBean = gson.fromJson(value, LoginBean.class);
//                iLoginPresenter.loginSuccess(loginBean);
//            }
//        });

        ViseHttp.GET("login.php?name=")
                .addParam("name", name)
                .addParam("pwd", pwd)
                .request(new ACallback<String>() {
                    @Override
                    public void onSuccess(String data) {
                        Log.e("111", data);
                    }

                    @Override
                    public void onFail(int errCode, String errMsg) {

                    }
                });

    }
}
