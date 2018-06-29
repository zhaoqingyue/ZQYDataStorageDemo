package com.mtq.zqydatastorage.ui.activity.file;

import android.widget.ListView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.FileApiHelper;
import com.mtq.zqydatastorage.ui.adapter.ApiAdapter;

import butterknife.BindView;

public class ApiActivity extends BaseActivity {

    @BindView(R.id.listView)
    ListView listView;

    ApiAdapter adapter;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_file_api;
    }

    @Override
    protected String getTitleName() {
        return "存储目录API";
    }

    @Override
    protected void initData() {
        adapter = new ApiAdapter(this, FileApiHelper.getApiList());
        listView.setAdapter(adapter);
    }
}
