package com.zjw.utils;

import com.google.gson.Gson;
import com.zjw.domain.BiliBili;
import com.zjw.domain.BiliBiliJLP;
import com.zjw.domain.BiliBiliSingle;

import java.util.HashMap;

public class BiBiUtils {

    private static Gson gson;
    static {
        gson = new Gson();
    }

    public static String getVideoName(String fileJson){
        BiliBili bili = null;
        try {
            bili = gson.fromJson(fileJson, BiliBili.class);
        }catch (Exception e){
            return "合并";
        }
        //根据文件名，获取输出文件的路径
        String name = null;
        try{
            name = bili.getPage_data().getPart().trim();
        }catch (Exception e){

        }

        if (name == null){
            BiliBiliJLP jlp = gson.fromJson(fileJson, BiliBiliJLP.class);
            try {
                name = jlp.getEp().getIndex_title().trim();
            }catch (Exception e){
            }
        }

        if (name == null){
            BiliBiliSingle biliBiliSingle = gson.fromJson(fileJson, BiliBiliSingle.class);
            try {
                name = biliBiliSingle.getTitle().trim();
            }catch (Exception e){
            }
        }

        if (name == null){
            name = "合并";
        }

        return name;
    }

    public static int getVideoIndex(String fileJson){
        BiliBili bili = gson.fromJson(fileJson, BiliBili.class);
        //根据文件名，获取输出文件的路径
        int page = 0 ;
        try{
            page = bili.getPage_data().getPage();//第几集
        }catch (Exception e){

        }

        if (page == 0){
            BiliBiliJLP jlp = gson.fromJson(fileJson, BiliBiliJLP.class);
            try {
                page = Integer.valueOf(jlp.getEp().getIndex());
            }catch (Exception e){
            }
        }

        return page;
    }
    
}
