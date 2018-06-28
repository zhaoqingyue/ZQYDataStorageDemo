package com.mtq.zqysharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PACKAGE_NAME = "com.mtq.zqydatastorage";
    public static final String SP_NAME = "zhaoqy_sp";

    private Context othercontext;
    private SharedPreferences sp;

    private Button btn_get;
    private TextView tv_name;
    private TextView tv_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_get = (Button) findViewById(R.id.btn_get);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_pwd = (TextView) findViewById(R.id.tv_pwd);

        btn_get.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 获得PACKAGE_NAME对应的应用的包名, 从而获得对应的Context,需要对异常进行捕获
                try {
                    othercontext = createPackageContext(PACKAGE_NAME, Context.CONTEXT_IGNORE_SECURITY);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                // 根据Context取得对应的SharedPreferences
                sp = othercontext.getSharedPreferences(SP_NAME, Context.MODE_WORLD_READABLE);
                String name = sp.getString("username", "");
                String passwd = sp.getString("passwd", "");
                tv_name.setText("用户名：" + name);
                tv_pwd.setText("密码：" + passwd);
            }
        });
    }
}
