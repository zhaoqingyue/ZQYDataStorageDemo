package com.mtq.zqydatastorage.ui.activity.file;

import android.widget.ListView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.ExclusiveHelper;
import com.mtq.zqydatastorage.ui.adapter.ExclusiveAdapter;

import butterknife.BindView;

public class ExclusiveActivity extends BaseActivity {

    @BindView(R.id.listView)
    ListView listView;

    ExclusiveAdapter adapter;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_exclusive;
    }

    @Override
    protected String getTitleName() {
        return "App专属文件";
    }

    @Override
    protected void initData() {
        adapter = new ExclusiveAdapter(this, ExclusiveHelper.getExclusiveList());
        listView.setAdapter(adapter);
    }
}
