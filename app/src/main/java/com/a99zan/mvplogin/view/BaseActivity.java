package com.a99zan.mvplogin.view;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import com.a99zan.mvplogin.utils.ToastUtil;

/**
 * Created by 99zan on 2018/4/4.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init(savedInstanceState);
    }
//    protected void showToast(String msg) {
//        ToastUtils.show(msg);
//    }

    protected abstract @LayoutRes
    int getLayoutId();

    protected abstract void init(Bundle savedInstanceState);

    protected void showToast(String msg){
        ToastUtil.showShort(this, msg);
    }

}
