package com.zjw.main;

import com.google.gson.Gson;
import com.zjw.gson.LinuxBean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * @author 朱俊伟
 * @date 2021/05/31
 */
public class RenameFile {

    public static Gson gson = new Gson();
    public static Map<String,LinuxBean> jsonMap = new HashMap<>();
    public static Map<String,String> fileNameMap = new HashMap<>();
    public static void main(String[] args) throws Exception {
        // FFmpeg全路径
        String FFMPEG_PATH = "D:\\ffmpeg\\bin\\ffmpeg.exe";
        //音视频文件的位置
        String IN_PATH = "F:\\教程\\韩顺平Linux\\245360337";
        //输出文件的位置
        String OUT_PATH = "F:\\教程\\韩顺平Linux\\合并\\";
//        getFiles(OUT_PATH);
        getEntryJson(IN_PATH);
        Set<String> keySet = jsonMap.keySet();
        for (String s : keySet) {
            System.out.println(s + "-->" + jsonMap.get(s).getPageData().getPart());
        }
//        System.out.println(linuxBeanMap.size());
//        getJsonMap(IN_PATH);
//        getFiles(OUT_PATH);
    }


    /**
     * 获取路径下的所有文件集合
     * @param path
     * @return
     */
    public static Map<String,String> getFiles(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        Map<String,String> fileMap = new HashMap<>();
        for (File f : files) {
            fileMap.put(f.getName().substring(0,3),f.getName());
        }
        System.out.println(Arrays.asList(files));
        return fileMap;
    }

    public static Map<String, LinuxBean> getEntryJson(String path) throws Exception{
        File file = new File(path);
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isDirectory()){
                getEntryJson(listFile.getPath());
            }else {
                String is = listFile.getName();
                if ("entry.json".equals(listFile.getName())){
                    //获取输出的文件名
                    BufferedReader br = new BufferedReader(new FileReader(listFile));
                    String fileJson = br.readLine();
                    br.close();
                    LinuxBean jsonFile = gson.fromJson(fileJson, LinuxBean.class);
                    String name = jsonFile.getPageData().getPart();
                    jsonMap.put(name.substring(0,3),jsonFile);
                }
            }
        }
        return jsonMap;
    }

    public static void getJsonMap(String path) throws Exception{
        File file = new File(path);
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isDirectory()){
                getEntryJson(listFile.getPath());
            }else {
                String is = listFile.getName();
                if ("entry.json".equals(listFile.getName())){
                    //获取输出的文件名
                    BufferedReader br = new BufferedReader(new FileReader(listFile));
                    String fileJson = br.readLine();
                    br.close();
                    LinuxBean jsonFile = gson.fromJson(fileJson, LinuxBean.class);
                    String name = jsonFile.getPageData().getPart();
                    fileNameMap.put(name.substring(19),name.substring(0,3));
//                    System.out.println(name.substring(0,3) + "-->" + jsonFile);
                }
            }
        }
    }
}
