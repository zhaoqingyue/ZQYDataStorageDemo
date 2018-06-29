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
        apiInfo0.no = 0;
        apiInfo0.type = "/data：内部存储";
        apiInfo0.api = "Environment.getDataDirectory()";
        apiInfo0.des = "获取内部存储的根路径";
        list.add(apiInfo0);

        ApiInfo apiInfo1 = new ApiInfo();
        apiInfo1.no = 1;
        apiInfo1.type = "/data：内部存储";
        apiInfo1.api = "getFilesDir()";
        apiInfo1.des = "获取某个应用在内部存储中的files路径";
        list.add(apiInfo1);

        ApiInfo apiInfo2 = new ApiInfo();
        apiInfo2.no = 2;
        apiInfo2.type = "/data：内部存储";
        apiInfo2.api = "getCacheDir()";
        apiInfo2.des = "获取某个应用在内部存储中的cache路径";
        list.add(apiInfo2);

        ApiInfo apiInfo3 = new ApiInfo();
        apiInfo3.no = 3;
        apiInfo3.type = "/data：内部存储";
        apiInfo3.api = "getDir()";
        apiInfo3.des = "获取某个应用在内部存储中的自定义路径";
        list.add(apiInfo3);

        ApiInfo apiInfo4 = new ApiInfo();
        apiInfo4.no = 4;
        apiInfo4.type = "/storage：外部存储";
        apiInfo4.api = "Environment.getExternalStorageDirectory()";
        apiInfo4.des = "获取外部存储的根路径";
        list.add(apiInfo4);

        ApiInfo apiInfo5 = new ApiInfo();
        apiInfo5.no = 5;
        apiInfo5.type = "/storage：外部存储";
        apiInfo5.api = "getExternalStoragePublicDirectory()";
        apiInfo5.des = "获取外部存储的根路径";
        list.add(apiInfo5);

        ApiInfo apiInfo6 = new ApiInfo();
        apiInfo6.no = 6;
        apiInfo6.type = "/storage：外部存储";
        apiInfo6.api = "getExternalFilesDir()";
        apiInfo6.des = "获取某个应用在外部存储中的files路径";
        list.add(apiInfo6);

        ApiInfo apiInfo7 = new ApiInfo();
        apiInfo7.no = 7;
        apiInfo7.type = "/storage：外部存储";
        apiInfo7.api = "getExternalCacheDir()";
        apiInfo7.des = "获取某个应用在外部存储中的cache路径";
        list.add(apiInfo7);

        ApiInfo apiInfo8 = new ApiInfo();
        apiInfo8.no = 8;
        apiInfo8.type = "/cache：系统缓存";
        apiInfo8.api = "Environment.getDownloadCacheDirectory()";
        apiInfo8.des = "获取Android系统缓存路径";
        list.add(apiInfo8);

        ApiInfo apiInfo9 = new ApiInfo();
        apiInfo9.no = 9;
        apiInfo9.type = "/system：系统";
        apiInfo9.api = "Environment.getRootDirectory()";
        apiInfo9.des = "获取Android系统路径";
        list.add(apiInfo9);

        return list;
    }

    /**
     * 获取内部存储API
     */
    public static ArrayList<ApiInfo> getInternalApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo0 = new ApiInfo();
        apiInfo0.no = 0;
        apiInfo0.type = "/data：内部存储";
        apiInfo0.api = "Environment.getDataDirectory()";
        apiInfo0.des = "获取内部存储的根路径";
        list.add(apiInfo0);

        ApiInfo apiInfo1 = new ApiInfo();
        apiInfo1.no = 1;
        apiInfo1.type = "/data：内部存储";
        apiInfo1.api = "getFilesDir()";
        apiInfo1.des = "获取某个应用在内部存储中的files路径";
        list.add(apiInfo1);

        ApiInfo apiInfo2 = new ApiInfo();
        apiInfo2.no = 2;
        apiInfo2.type = "/data：内部存储";
        apiInfo2.api = "getCacheDir()";
        apiInfo2.des = "获取某个应用在内部存储中的cache路径";
        list.add(apiInfo2);

        ApiInfo apiInfo3 = new ApiInfo();
        apiInfo3.no = 3;
        apiInfo3.type = "/data：内部存储";
        apiInfo3.api = "getDir()";
        apiInfo3.des = "获取某个应用在内部存储中的自定义路径";
        list.add(apiInfo3);

        return list;
    }

    /**
     * 获取外部存储API
     */
    public static ArrayList<ApiInfo> getExternalApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo4 = new ApiInfo();
        apiInfo4.no = 4;
        apiInfo4.type = "/storage：外部存储";
        apiInfo4.api = "Environment.getExternalStorageDirectory()";
        apiInfo4.des = "获取外部存储的根路径";
        list.add(apiInfo4);

        ApiInfo apiInfo5 = new ApiInfo();
        apiInfo5.no = 5;
        apiInfo5.type = "/storage：外部存储";
        apiInfo5.api = "getExternalStoragePublicDirectory()";
        apiInfo5.des = "获取外部存储的根路径";
        list.add(apiInfo5);

        ApiInfo apiInfo6 = new ApiInfo();
        apiInfo6.no = 6;
        apiInfo6.type = "/storage：外部存储";
        apiInfo6.api = "getExternalFilesDir()";
        apiInfo6.des = "获取某个应用在外部存储中的files路径";
        list.add(apiInfo6);

        ApiInfo apiInfo7 = new ApiInfo();
        apiInfo7.no = 7;
        apiInfo7.type = "/storage：外部存储";
        apiInfo7.api = "getExternalCacheDir()";
        apiInfo7.des = "获取某个应用在外部存储中的cache路径";
        list.add(apiInfo7);

        return list;
    }

    /**
     * 获取专属文件API
     */
    public static ArrayList<ApiInfo> getExclusiveApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo1 = new ApiInfo();
        apiInfo1.no = 1;
        apiInfo1.type = "/data：内部存储";
        apiInfo1.api = "getFilesDir()";
        apiInfo1.des = "获取某个应用在内部存储中的files路径";
        list.add(apiInfo1);

        ApiInfo apiInfo6 = new ApiInfo();
        apiInfo6.no = 6;
        apiInfo6.type = "/storage：外部存储";
        apiInfo6.api = "getExternalFilesDir()";
        apiInfo6.des = "获取某个应用在外部存储中的files路径";
        list.add(apiInfo6);

        return list;
    }

    /**
     * 获取独立文件API
     */
    public static ArrayList<ApiInfo> getIndependentApiList() {
        ArrayList<ApiInfo> list = new ArrayList<ApiInfo>();

        ApiInfo apiInfo4 = new ApiInfo();
        apiInfo4.no = 4;
        apiInfo4.type = "/storage：外部存储";
        apiInfo4.api = "Environment.getExternalStorageDirectory()";
        apiInfo4.des = "获取外部存储的根路径";
        list.add(apiInfo4);

        ApiInfo apiInfo5 = new ApiInfo();
        apiInfo5.no = 5;
        apiInfo5.type = "/storage：外部存储";
        apiInfo5.api = "getExternalStoragePublicDirectory()";
        apiInfo5.des = "获取外部存储的根路径";
        list.add(apiInfo5);

        return list;
    }

}
