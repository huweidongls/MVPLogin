package com.a99zan.mvplogin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.a99zan.mvplogin.R;
import com.a99zan.mvplogin.presenter.LoginPresenter;

public class MainActivity extends BaseActivity implements ILoginView {

    private EditText etName;
    private EditText etPwd;
    private Button btn;
    private LoginPresenter loginPresenter;
    private TextView textView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        loginPresenter = new LoginPresenter(this);
        textView = (TextView) findViewById(R.id.tv);
        etName = (EditText) findViewById(R.id.etName);
        etPwd = (EditText) findViewById(R.id.etPwd);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                loginPresenter.login(MainActivity.this);

//                String name = "123";
//                String pwd = "123";
//                RetrofitHelper.getApiService()
//                        .getLoginInfo(name, pwd)
//                        .compose(MainActivity.this.<LoginBean>bindToLifecycle())
//                        .compose(ProgressUtils.<LoginBean>applyProgressBar(MainActivity.this))
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new DefaultObserver<LoginBean>() {
//                            @Override
//                            public void onSuccess(LoginBean response) {
//                                Log.e("111", "请求成功，妹子个数为" + response.getInfo());
//                            }
//                        });
            }
        });
    }

    @Override
    public String getUserName() {
        return etName.getText().toString();
    }

    @Override
    public String getPassWord() {
        return etPwd.getText().toString();
    }

    @Override
    public void showLoginSuccess() {
        showToast("登录成功！");
    }

    @Override
    public void showLoginFail() {
        Toast.makeText(MainActivity.this, "登陆失败！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginInfo(String str) {
        textView.setText(str);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter = null;
    }
}
