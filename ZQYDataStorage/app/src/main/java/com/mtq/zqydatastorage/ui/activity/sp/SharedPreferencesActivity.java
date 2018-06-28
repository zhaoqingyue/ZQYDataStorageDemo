package com.mtq.zqydatastorage.ui.activity.sp;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.base.BaseActivity;
import com.mtq.zqydatastorage.helper.SharedHelper;
import com.mtq.zqydatastorage.utils.MD5;
import com.mtq.zqydatastorage.utils.ToastUtils;

import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;


public class SharedPreferencesActivity extends BaseActivity {

    @BindView(R.id.edit_name)
    EditText editName;

    @BindView(R.id.edit_pwd)
    EditText editPwd;

    @BindView(R.id.tv_md5)
    TextView tv_md5;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_shared_preferences;
    }

    @Override
    protected String getTitleName() {
        return "SharedPreferences";
    }

    @Override
    protected void initData() {
        Map<String,String> data = SharedHelper.read(this);
        String name = data.get("username");
        if (!TextUtils.isEmpty(name)) {
            editName.setText(name);
        }

        String pwd =data.get("passwd");
        if (!TextUtils.isEmpty(pwd)) {
            editPwd.setText(pwd);
        }
    }

    @OnClick({R.id.btn_login, R.id.btn_md5})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login: {
                String name = editName.getText().toString();
                String pwd = editPwd.getText().toString();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
                    SharedHelper.save(this, name, pwd);
                    ToastUtils.getIntance().makeText(this, "信息已写入SharedPreference中");
                } else {
                    if (TextUtils.isEmpty(name)) {
                        ToastUtils.getIntance().makeText(this, "请输入用户名");
                    } else if (TextUtils.isEmpty(pwd)) {
                        ToastUtils.getIntance().makeText(this, "请输入密码");
                    }
                }
                break;
            }
            case R.id.btn_md5: {
                String md5 = MD5.getMD5x100("zhaoqy");
                tv_md5.setText(md5);
                break;
            }
        }
    }
}
