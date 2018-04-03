package com.a99zan.mvplogin.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.a99zan.mvplogin.R;
import com.a99zan.mvplogin.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText etName;
    private EditText etPwd;
    private Button btn;
    private LoginPresenter loginPresenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    /**
     * 初始化控件
     */
    private void init() {
        loginPresenter = new LoginPresenter(this);
        textView = (TextView) findViewById(R.id.tv);
        etName = (EditText) findViewById(R.id.etName);
        etPwd = (EditText) findViewById(R.id.etPwd);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loginPresenter.login();
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
        Toast.makeText(MainActivity.this, "登陆成功！", Toast.LENGTH_SHORT).show();
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
