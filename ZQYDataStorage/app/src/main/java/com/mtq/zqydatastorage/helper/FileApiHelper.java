package com.mtq.zqydatastorage.helper;

import com.mtq.zqydatastorage.data.bean.ApiInfo;

import java.util.ArrayList;

/**
 * Created by zhaoqy on 2018/6/28.
 */

public class FileApiHelper {

    public static ArrayList<ApiInfo> getApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo0 = new ApiInfo();
        apiInfo0.type = "/data";
        apiInfo0.api = "Environment.getDataDirectory()";
        apiInfo0.des = "获取内部存储的根路径";
        list.add(apiInfo0);

        ApiInfo apiInfo1 = new ApiInfo();
        apiInfo1.type = "/data";
        apiInfo1.api = "getFilesDir().getAbsolutePath()";
        apiInfo1.des = "获取某个应用在内部存储中的files路径";
        list.add(apiInfo1);

        ApiInfo apiInfo2 = new ApiInfo();
        apiInfo2.type = "/data";
        apiInfo2.api = "getCacheDir().getAbsolutePath()";
        apiInfo2.des = "获取某个应用在内部存储中的cache路径";
        list.add(apiInfo2);

        ApiInfo apiInfo3 = new ApiInfo();
        apiInfo3.type = "/data";
        apiInfo3.api = "getDir()";
        apiInfo3.des = "获取某个应用在内部存储中的自定义路径";
        list.add(apiInfo3);

        ApiInfo apiInfo4 = new ApiInfo();
        apiInfo4.type = "/storage";
        apiInfo4.api = "Environment.getExternalStorageDirectory()";
        apiInfo4.des = "获取外部存储的根路径";
        list.add(apiInfo4);

        ApiInfo apiInfo5 = new ApiInfo();
        apiInfo5.type = "/storage";
        apiInfo5.api = "Environment.getExternalStoragePublicDirectory()";
        apiInfo5.des = "获取外部存储的根路径";
        list.add(apiInfo5);

        ApiInfo apiInfo6 = new ApiInfo();
        apiInfo6.type = "/storage/";
        apiInfo6.api = "getExternalFilesDir()";
        apiInfo6.des = "获取某个应用在外部存储中的files路径";
        list.add(apiInfo6);

        ApiInfo apiInfo7 = new ApiInfo();
        apiInfo7.type = "/storage";
        apiInfo7.api = "getExternalCacheDir()";
        apiInfo7.des = "获取某个应用在外部存储中的cache路径";
        list.add(apiInfo7);

        ApiInfo apiInfo8 = new ApiInfo();
        apiInfo8.type = "/cache";
        apiInfo8.api = "Environment.getDownloadCacheDirectory()";
        apiInfo8.des = "获取Android系统缓存路径";
        list.add(apiInfo8);

        ApiInfo apiInfo9 = new ApiInfo();
        apiInfo9.type = "/system";
        apiInfo9.api = "Environment.getRootDirectory()";
        apiInfo9.des = "获取Android系统系统路径";
        list.add(apiInfo9);

        return list;
    }

    public static ArrayList<ApiInfo> getInternalApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo0 = new ApiInfo();
        apiInfo0.type = "/data";
        apiInfo0.api = "Environment.getDataDirectory()";
        apiInfo0.des = "获取内部存储的根路径";
        list.add(apiInfo0);

        ApiInfo apiInfo1 = new ApiInfo();
        apiInfo1.type = "/data";
        apiInfo1.api = "getFilesDir().getAbsolutePath()";
        apiInfo1.des = "获取某个应用在内部存储中的files路径";
        list.add(apiInfo1);

        ApiInfo apiInfo2 = new ApiInfo();
        apiInfo2.type = "/data";
        apiInfo2.api = "getCacheDir().getAbsolutePath()";
        apiInfo2.des = "获取某个应用在内部存储中的cache路径";
        list.add(apiInfo2);

        ApiInfo apiInfo3 = new ApiInfo();
        apiInfo3.type = "/data";
        apiInfo3.api = "getDir()";
        apiInfo3.des = "获取某个应用在内部存储中的自定义路径";
        list.add(apiInfo3);

        return list;
    }

    public static ArrayList<ApiInfo> getExternalApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo4 = new ApiInfo();
        apiInfo4.type = "/storage";
        apiInfo4.api = "Environment.getExternalStorageDirectory()";
        apiInfo4.des = "获取外部存储的根路径";
        list.add(apiInfo4);

        ApiInfo apiInfo5 = new ApiInfo();
        apiInfo5.type = "/storage";
        apiInfo5.api = "Environment.getExternalStoragePublicDirectory()";
        apiInfo5.des = "获取外部存储的根路径";
        list.add(apiInfo5);

        ApiInfo apiInfo6 = new ApiInfo();
        apiInfo6.type = "/storage/";
        apiInfo6.api = "getExternalFilesDir()";
        apiInfo6.des = "获取某个应用在外部存储中的files路径";
        list.add(apiInfo6);

        ApiInfo apiInfo7 = new ApiInfo();
        apiInfo7.type = "/storage";
        apiInfo7.api = "getExternalCacheDir()";
        apiInfo7.des = "获取某个应用在外部存储中的cache路径";
        list.add(apiInfo7);

        return list;
    }


}
