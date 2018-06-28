package com.mtq.zqydatastorage.ui.activity.file;

import android.os.Environment;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;

import butterknife.BindView;

public class InternalStorageActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.tv_des)
    TextView tv_des;

    @BindView(R.id.tv_dir)
    TextView tv_dir;

    @BindView(R.id.tv_files_dir)
    TextView tv_files_dir;

    @BindView(R.id.tv_cache_dir)
    TextView tv_cache_dir;

    @BindView(R.id.tv_data_directory)
    TextView tv_data_directory;


    @Override
    protected int getLayoutResID() {
        return R.layout.activity_internal_storage;
    }

    @Override
    protected String getTitleName() {
        return "内部存储";
    }

    @Override
    protected void initData() {
        /**
         * 概念：
         * 内部存储中，文件默认只能被应用本身访问。
         * a. 如果你在创建内部存储文件的时，将文件属性设置成可读，其它app能够访问该应用的数据(
         * 前提是其它app知道该应用的包名)。
         * b. 如果文件的属性是私有（private），那么即使知道包名，其它app也无法访问。
         * c. 当一个应用卸载后，内部存储中的这些文件也被删除。
         * d. SharedPreferences和SQLite数据库，都是存储在内部存储空间。
         *
         * SharedPreferences和SQLite数据库都是存储在内部存储空间
         *
         * 注意：内部存储不是内存
         */
        tv_des.setText("----内部存储中，文件默认只能被应用本身访问。\n " +
                "a. 如果你在创建内部存储文件的时，将文件属性设置成可读，其它app能够访问该应用的数据" +
                "(前提是其它app知道该应用的包名)。\n" +
                "b. 如果文件的属性是私有（private），那么即使知道包名，其它app也无法访问。\n" +
                "c. 当一个应用卸载后，内部存储中的这些文件也被删除。\n" +
                "d. SharedPreferences和SQLite数据库，都是存储在内部存储空间。\n\n" +
                "注意：内部存储不是内存。");

        String path0 = getDir("zqy", MODE_PRIVATE).getAbsolutePath();
        LogUtils.i(TAG,"dir= " + path0);
        tv_dir.setText(path0);

        /**
         * 6.0以前系统：/data/data/com.mtq.zqydatastorage/files
         *
         * 6.0及以后系统：/data/user/0/com.mtq.zqydatastorage/files
         */
        String path1 = getFilesDir().getAbsolutePath();
        LogUtils.i(TAG,"files_dir= " + path1);
        tv_files_dir.setText(path1);

        String path2 = getCacheDir().getAbsolutePath();
        LogUtils.i(TAG,"cache_dir= " + path2);
        tv_cache_dir.setText(path2);

        String path3 = Environment.getDataDirectory().toString();
        LogUtils.i(TAG,"data_directory= " + path3);
        tv_data_directory.setText(path3);
    }
}
