package com.mtq.zqydatastorage.ui.activity.file;

import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.utils.ToastUtils;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;

public class FilePathActivity extends BaseActivity {

    public static final String TAG = "ZQY";

    @BindView(R.id.tv_one)
    TextView tv_one;

    @BindView(R.id.tv_two)
    TextView tv_two;

    @BindView(R.id.tv_three)
    TextView tv_three;

    @BindView(R.id.tv_four)
    TextView tv_four;

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

    }

    @OnClick({R.id.btn_one, R.id.btn_two, R.id.btn_three, R.id.btn_four})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one: {
                /**
                 * internal storage
                 * 私有的目录，shared preference文件，数据库文件，都存储在这里。
                 * 目录为data/data/< package name >/files/
                 */
                File filesDir = getFilesDir();
                if (filesDir != null) {
                    LogUtils.i(TAG,"file_dir= " + filesDir.toString());
                    tv_one.setText(filesDir.toString());
                }
                break;
            }
            case R.id.btn_two: {
                /**
                 * external storage
                 * 这类文件不应该存在SD卡的根目录下，而应该存在mnt/sdcard/Android/data/< package name >/files/…这个目录下。
                 * 这类文件应该随着App的删除而一起删除。例如一种格式的电子书，只有该app才可以打开，
                 * 如果用户删除了该app，那么留下来的电子书就成为了一种无法打开的垃圾文件，所以应该随着该app一起删除掉。
                 */
                if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                    // SD卡已装入
                    File externalFilesDir = getExternalFilesDir(null);
                    // File externalFilesDir = getExternalFilesDir("Caches");
                    if (externalFilesDir != null) {
                        LogUtils.i(TAG, "externalFileDir= " + externalFilesDir.toString());
                        tv_two.setText(externalFilesDir.toString());
                    }
                } else {
                    ToastUtils.getIntance().makeText(this, "未检测到SD卡");
                }
                break;
            }
            case R.id.btn_three: {
                /**
                 * getExternalStorageDirectory
                 * sdCard的路径为：mnt/sdcard/ 即为SD卡根路径，我们可以指定访问的文件夹名
                 */
                File sdCard = Environment.getExternalStorageDirectory();
                if (sdCard != null) {
                    File directory_pictures = new File(sdCard, "Pictures");
                    if (directory_pictures != null) {
                        LogUtils.i(TAG, "directory_pictures= " + directory_pictures.toString());
                        tv_three.setText(directory_pictures.getAbsolutePath());
                    }
                }
                break;
            }
            case R.id.btn_four: {
                /**
                 * getExternalStoragePublicDirectory
                 */
                File directory_pictures = Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES);
                if (directory_pictures != null) {
                    LogUtils.i(TAG, "directory_pictures= " + directory_pictures.toString());
                    tv_four.setText(directory_pictures.toString());
                }
                break;
            }
        }
    }
}
