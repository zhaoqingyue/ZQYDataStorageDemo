package com.mtq.zqydatastorage.ui.activity.file;

import android.widget.TextView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;

import butterknife.BindView;

public class ExternalStorageActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.tv_des)
    TextView tv_des;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_external_storage;
    }

    @Override
    protected String getTitleName() {
        return "外部存储";
    }

    @Override
    protected void initData() {
        /**
         *
         */
        tv_des.setText("");
    }
}
