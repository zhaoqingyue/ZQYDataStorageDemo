package com.mtq.zqydatastorage.ui.activity.file;

import android.widget.ScrollView;
import android.widget.TextView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.FileApiHelper;
import com.mtq.zqydatastorage.ui.adapter.ApiAdapter;
import com.mtq.zqydatastorage.ui.widget.ListViewForScrollView;

import butterknife.BindView;

public class ExternalStorageActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.sv)
    ScrollView sv;

    @BindView(R.id.tv_des)
    TextView tv_des;

    @BindView(R.id.listView)
    ListViewForScrollView listView;

    ApiAdapter adapter;

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
         * 小于4.4（API19）系统：
         * 手机自身带的存储卡就是内部存储，而扩展的SD卡就是外部存储。
         *
         * 大于或等于4.4系统：
         * 手机将机身存储（手机自身带的存储叫做机身存储）在概念上分成了" 内部存储internal" 和
         * " 外部存储external" 两部分。扩展的SD卡也是外部存储。
         *
         * 手机的外部存储包含两部分，一是机身存储的外部存储部分，还有一个是SD卡部分。
         */
        tv_des.setText("小于4.4（API19）系统：\n" +
                "手机自身带的存储卡就是内部存储，而扩展的SD卡就是外部存储。\n\n" +
                "大于或等于4.4系统：\n" +
                "手机将机身存储（手机自身带的存储叫做机身存储）在概念上分成了\" 内部存储internal\" 和 " +
                "\" 外部存储external\" 两部分。扩展的SD卡也是外部存储。\n\n" +
                "手机的外部存储包含两部分，一是机身存储的外部存储部分，还有一个是SD卡部分。");

        sv.smoothScrollTo(0, 0);
        adapter = new ApiAdapter(this, FileApiHelper.getExternalApiList());
        listView.setAdapter(adapter);
    }
}
