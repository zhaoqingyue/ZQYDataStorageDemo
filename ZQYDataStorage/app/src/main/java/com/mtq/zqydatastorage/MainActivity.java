package com.mtq.zqydatastorage;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.ui.activity.file.FileActivity;
import com.mtq.zqydatastorage.ui.activity.sp.SharedPreferencesActivity;
import com.mtq.zqydatastorage.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.tv_des)
    TextView des;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected String getTitleName() {
        return "数据存储";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected boolean isHasNaviIcon() {
        return false;
    }

    @OnClick({R.id.btn_sqlite, R.id.btn_contentProvide, R.id.btn_sharedPreferences,
        R.id.btn_file, R.id.btn_network, R.id.btn_application})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sqlite: {
                // SQLlite数据库
//                Intent intent = new Intent(this, CreateActivity.class);
//                startActivity(intent);
                break;
            }
            case R.id.btn_contentProvide: {
                // ContentProvider
//                Intent intent = new Intent(this, StructureActivity.class);
//                startActivity(intent);
                break;
            }
            case R.id.btn_sharedPreferences: {
                // SharedPreferences
                Intent intent = new Intent(this, SharedPreferencesActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_file: {
                // 文件存储
                Intent intent = new Intent(this, FileActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_network: {
                // 网络存储
//                Intent intent = new Intent(this, StructureActivity.class);
//                startActivity(intent);
                break;
            }
            case R.id.btn_application: {
                // Application
//                Intent intent = new Intent(this, BehaviorActivity.class);
//                startActivity(intent);
                break;
            }
        }
    }

    private long mExitTime;

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if (System.currentTimeMillis() - mExitTime > 2000) {
//            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            ToastUtils.getIntance().makeText(this, "再按一次退出程序");

            // 解决 MIUI Toast会显示APP名字的问题
//            Toast toast = Toast.makeText(this, null, Toast.LENGTH_SHORT);
//            toast.setText("再按一次退出程序");
//            toast.show();

            mExitTime = System.currentTimeMillis();
        } else {
            finish();
        }
    }
}
