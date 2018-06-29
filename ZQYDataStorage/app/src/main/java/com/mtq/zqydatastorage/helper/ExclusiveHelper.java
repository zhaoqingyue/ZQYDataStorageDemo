package com.mtq.zqydatastorage.helper;

import com.mtq.zqydatastorage.data.bean.ExclusiveInfo;

import java.util.ArrayList;

/**
 * Created by zhaoqy on 2018/6/29.
 */

public class ExclusiveHelper {

    public static ArrayList<ExclusiveInfo> getExclusiveList() {
        ArrayList<ExclusiveInfo> list = new ArrayList<ExclusiveInfo>();

        ExclusiveInfo exclusiveInfo0 = new ExclusiveInfo();
        exclusiveInfo0.version = "4.1.1";
        exclusiveInfo0.pos = "带SD卡";
        exclusiveInfo0.api1 = "getFilesDir()";
        exclusiveInfo0.path1 = "/data/data/packname/files";
        exclusiveInfo0.type1 = "内部存储";
        exclusiveInfo0.api2 = "getExternalStorageDirectory()";
        exclusiveInfo0.path2 = "/storage/sdcard0/Android/data/packname/files";
        exclusiveInfo0.type2 = "外部存储（SD卡）";
        list.add(exclusiveInfo0);

        ExclusiveInfo exclusiveInfo1 = new ExclusiveInfo();
        exclusiveInfo1.version = "4.1.1";
        exclusiveInfo1.pos = "不带SD卡";
        exclusiveInfo1.api1 = "getFilesDir()";
        exclusiveInfo1.path1 = "/data/data/packname/files";
        exclusiveInfo1.type1 = "内部存储";
        exclusiveInfo1.api2 = "getExternalStorageDirectory()";
        exclusiveInfo1.path2 = "路径不存在";
        exclusiveInfo1.type2 = "没插SD卡";
        list.add(exclusiveInfo1);

        ExclusiveInfo exclusiveInfo2 = new ExclusiveInfo();
        exclusiveInfo2.version = "4.4.2";
        exclusiveInfo2.pos = "带SD卡";
        exclusiveInfo2.api1 = "getFilesDir()";
        exclusiveInfo2.path1 = "/data/data/packname/files";
        exclusiveInfo2.type1 = "内部存储";
        exclusiveInfo2.api2 = "getExternalStorageDirectory()";
        exclusiveInfo2.path2 = "/storage/emulated/0/Android/data/packname/files";
        exclusiveInfo2.type2 = "机身外部存储";
        exclusiveInfo2.api3 = "getExternalFilesDirs";
        exclusiveInfo2.path3 = "/storage/sdcard1";
        exclusiveInfo2.type3 = "外部存储（SD卡没有向其写数据，只是读取）";
        list.add(exclusiveInfo2);

        ExclusiveInfo exclusiveInfo3 = new ExclusiveInfo();
        exclusiveInfo3.version = "4.4.2";
        exclusiveInfo3.pos = "不带SD卡";
        exclusiveInfo3.api1 = "getFilesDir()";
        exclusiveInfo3.path1 = "/data/data/packname/files";
        exclusiveInfo3.type1 = "内部存储";
        exclusiveInfo3.api2 = "getExternalStorageDirectory()";
        exclusiveInfo3.path2 = "/storage/emulated/0/Android/data/packname/files";
        exclusiveInfo3.type2 = "机身外部存储";
        list.add(exclusiveInfo3);

        ExclusiveInfo exclusiveInfo4 = new ExclusiveInfo();
        exclusiveInfo4.version = "6.0.0";
        exclusiveInfo4.pos = "带SD卡";
        exclusiveInfo4.api1 = "getFilesDir()";
        exclusiveInfo4.path1 = "/data/user/0/packname/files";
        exclusiveInfo4.type1 = "内部存储";
        exclusiveInfo4.api2 = "getExternalStorageDirectory()";
        exclusiveInfo4.path2 = "/storage/emulated/0/Android/data/packname/files";
        exclusiveInfo4.type2 = "机身外部存储";
        exclusiveInfo4.api3 = "getExternalFilesDirs";
        exclusiveInfo4.path3 = "/storage/B3E4-1711";
        exclusiveInfo4.type3 = "外部存储（SD卡没有向其写数据，只是读取）";
        list.add(exclusiveInfo4);

        ExclusiveInfo exclusiveInfo5 = new ExclusiveInfo();
        exclusiveInfo5.version = "6.0.0";
        exclusiveInfo5.pos = "不带SD卡";
        exclusiveInfo5.api1 = "getFilesDir()";
        exclusiveInfo5.path1 = "/data/user/0/packname/files";
        exclusiveInfo5.type1 = "内部存储";
        exclusiveInfo5.api2 = "getExternalStorageDirectory()";
        exclusiveInfo5.path2 = "/storage/emulated/0/Android/data/packname/files";
        exclusiveInfo5.type2 = "机身外部存储";
        list.add(exclusiveInfo5);

        return list;
    }
}
