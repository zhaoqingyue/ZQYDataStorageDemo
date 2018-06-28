package com.mtq.zqydatastorage.ui.activity.file;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.FileHelper;
import com.mtq.zqydatastorage.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class FileDataActivity extends BaseActivity {

    @BindView(R.id.edit_name)
    EditText editName;

    @BindView(R.id.edit_content)
    EditText editContent;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_file_data;
    }

    @Override
    protected String getTitleName() {
        return "数据存储";
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.btn_wirte, R.id.btn_read, R.id.btn_clean})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_wirte: {
                String fileName = editName.getText().toString();
                String fileContent = editContent.getText().toString();
                if (!TextUtils.isEmpty(fileName) && !TextUtils.isEmpty(fileContent)) {
                    try {
                        FileHelper.saveFile(this, fileName, fileContent);
                        ToastUtils.getIntance().makeText(this, "数据写入成功");
                    } catch (Exception e) {
                        e.printStackTrace();
                        ToastUtils.getIntance().makeText(this, "数据写入失败");
                    }
                } else {
                    if (TextUtils.isEmpty(fileName)) {
                        ToastUtils.getIntance().makeText(this, "请输入文件名");
                    } else if (TextUtils.isEmpty(fileContent)) {
                        ToastUtils.getIntance().makeText(this, "请输入文件内容");
                    }
                }
                break;
            }
            case R.id.btn_read: {
                try {
                    String fileName = editName.getText().toString();
                    if (TextUtils.isEmpty(fileName)) {
                        ToastUtils.getIntance().makeText(this, "请输入文件名");
                        return;
                    }

                    String fileContent = FileHelper.readFile(this, fileName);
                    if (!TextUtils.isEmpty(fileContent)) {
                        editContent.setText(fileContent);
                        ToastUtils.getIntance().makeText(this, fileContent);
                    } else {
                        ToastUtils.getIntance().makeText(this, "读取内容为空");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case R.id.btn_clean: {
                String fileName = editName.getText().toString();
                FileHelper.deletefile(this, fileName);

                editName.setText("");
                editContent.setText("");
                break;
            }
        }
    }
}
