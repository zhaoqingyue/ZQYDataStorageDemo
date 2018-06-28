package com.mtq.zqydatastorage.ui.activity.file;

import android.content.Intent;
import android.view.View;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;

import butterknife.OnClick;

public class FileActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_file;
    }

    @Override
    protected String getTitleName() {
        return "文件存储";
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.btn_internal, R.id.btn_external, R.id.btn_path, R.id.btn_data})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_internal: {
                Intent intent = new Intent(this, InternalStorageActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_external: {
                Intent intent = new Intent(this, ExternalStorageActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_path: {
                Intent intent = new Intent(this, FilePathActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_data: {
                Intent intent = new Intent(this, FileDataActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
