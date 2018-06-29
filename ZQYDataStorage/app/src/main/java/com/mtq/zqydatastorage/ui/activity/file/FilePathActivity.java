package com.mtq.zqydatastorage.ui.activity.file;

import android.widget.ListView;
import android.widget.ScrollView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.FileApiHelper;
import com.mtq.zqydatastorage.ui.adapter.ApiAdapter;

import butterknife.BindView;

public class FilePathActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.sv)
    ScrollView sv;

    @BindView(R.id.exclusiveListView)
    ListView exclusiveListView;

    ApiAdapter exclusiveAdapter;

    @BindView(R.id.independentListView)
    ListView independentListView;

    ApiAdapter independentAdapter;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_file_path;
    }

    @Override
    protected String getTitleName() {
        return "文件路径";
    }

    @Override
    protected void initData() {
        sv.smoothScrollTo(0, 0);
        exclusiveAdapter = new ApiAdapter(this, FileApiHelper.getExclusiveApiList());
        exclusiveListView.setAdapter(exclusiveAdapter);

        independentAdapter = new ApiAdapter(this, FileApiHelper.getIndependentApiList());
        independentListView.setAdapter(independentAdapter);
    }
}
