package com.mtq.zqydatastorage.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhaoqy on 2018/6/27.
 */

public class ToastUtils {

    private static ToastUtils toastUtils = null;
    private static Toast toast = null;

    private ToastUtils() {

    }

    public static ToastUtils getIntance() {
        if (toastUtils == null) {
            toastUtils = new ToastUtils();
        }
        return toastUtils;
    }

    public void makeText(Context context, String text) {
        if (toast == null) {
            // 解决 MIUI Toast会显示APP名字的问题
            toast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
            toast.setText(text);
        } else {
            toast.setText(text);
        }
        toast.show();
    }
}
