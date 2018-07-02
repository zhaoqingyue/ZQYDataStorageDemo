package com.mtq.zqydatastorage.helper;

import android.content.Context;
import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import static android.os.Environment.MEDIA_MOUNTED;

/**
 * Created by zhaoqy on 2018/6/27.
 * 文件管理器
 */

public class FileHelper {
    /**
     * 写入文件：输出流
     */
    public static void saveFile(Context context, String fileName, String str) {
        // 创建String对象保存文件名路径
        try {
            // 创建指定路径的文件
            File file = new File(context.getFilesDir(), fileName);
            // 如果文件不存在
            if (file.exists()) {
                // 创建新的空文件
                file.delete();
            }
            file.createNewFile();
            // 获取文件的输出流对象
            FileOutputStream outStream = new FileOutputStream(file);
            // 获取字符串对象的byte数组并写入文件流
            outStream.write(str.getBytes());
            // 最后关闭文件输出流
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除已存储的文件
     */
    public static void deletefile(Context context, String fileName) {
        try {
            // 找到文件所在的路径并删除该文件
            File file = new File(context.getFilesDir(), fileName);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文件里面的内容
     */
    public static String readFile(Context context, String fileName) {
        try {
            // 创建文件
            File file = new File(context.getFilesDir(), fileName);
            // 创建FileInputStream对象
            FileInputStream fis = new FileInputStream(file);
            // 创建字节数组 每次缓冲1M
            byte[] b = new byte[1024];
            int len = 0;// 一次读取1024字节大小，没有数据后返回-1.
            // 创建ByteArrayOutputStream对象
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // 一次读取1024个字节，然后往字符输出流中写读取的字节数
            while ((len = fis.read(b)) != -1) {
                baos.write(b, 0, len);
            }
            // 将读取的字节总数生成字节数组
            byte[] data = baos.toByteArray();
            // 关闭字节输出流
            baos.close();
            // 关闭文件输入流
            fis.close();
            // 返回字符串对象
            return new String(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFilePath(Context context,String dir) {
        String directoryPath="";
        if (MEDIA_MOUNTED.equals(Environment.getExternalStorageState()) ) {
            // 判断外部存储是否可用
            directoryPath =context.getExternalFilesDir(dir).getAbsolutePath();
        }else{
            // 没外部存储就使用内部存储
            directoryPath=context.getFilesDir() + File.separator + dir;
        }
        File file = new File(directoryPath);
        if(!file.exists()){
            //判断文件目录是否存在
            file.mkdirs();
        }
        return directoryPath;
    }
}
