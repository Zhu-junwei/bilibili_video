package com.zjw.main;

import com.zjw.utils.BiBiUtils;
import com.zjw.utils.PropertiesUtil;
import java.io.*;
import java.text.NumberFormat;

/**
 * @author 朱俊伟
 */
public class Main {

    /**
     * FFmpeg全路径
     */
    private static final String FFMPEG_PATH ;
    /**
     * 音视频文件的位置
     */
    private static final String IN_PATH ;
    /**
     * 输出文件的位置
     */
    private static final String OUT_PATH ;
    /**
     * 数字前缀
     */
    private static final boolean PREFIX_NUM;

    static PropertiesUtil propertiesUtil ;

    static {
        propertiesUtil = PropertiesUtil.getInstance();
        FFMPEG_PATH = propertiesUtil.getValue("FFMPEG_PATH");
        IN_PATH = propertiesUtil.getValue("IN_PATH");
        OUT_PATH = propertiesUtil.getValue("OUT_PATH");
        PREFIX_NUM = Boolean.parseBoolean(propertiesUtil.getValue("PREFIX_NUM"));
        System.out.println(FFMPEG_PATH);
    }

    /**
     * 合并文件计数
     */
    public static int count = 0;

    public static void main(String[] args) throws Exception {

        Long startTime = System.currentTimeMillis();
        File file = new File(OUT_PATH);
        if (!file.exists()){
            file.mkdirs();
        }
        try {
            getAll(IN_PATH,OUT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("转换完成，共计耗时:"+(endTime-startTime)/1000+"秒,转换文件:"+count+"个");
    }
    /**
     * 具体合成视频函数
     * @param videoInputPath
     *   原视频的全路径
     *
     * @param audioInputPath
     *   音频的全路径
     *
     * @param videoOutPath
     *   视频与音频结合之后的视频的路径
     */
    public static void convetor(String videoInputPath, String audioInputPath, String videoOutPath)
            throws Exception {
        File outPutFile = new File(videoOutPath);
        String finalName = outPutFile.getName();
        String outParentFilePath = outPutFile.getParentFile().getPath();
        //当时为啥要做个替换呢？不太记得原因了
        //可能是在执行command命令的时候，有空格的话执行会失败
        videoOutPath = outParentFilePath+"\\"+finalName.replace(" ","_");
        File outPutFile2 = new File(videoOutPath);

        Process process = null;
        InputStream errorStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader br = null;
        try {
            // ffmpeg命令
            String command = FFMPEG_PATH + " -i " + videoInputPath + " -i " + audioInputPath
                    + " -c:v copy -c:a aac -strict experimental " +
                    " -map 0:v:0 -map 1:a:0 "
                    + " -y " + videoOutPath;

            process = Runtime.getRuntime().exec(command);
            errorStream = process.getErrorStream();
            inputStreamReader = new InputStreamReader(errorStream);
            br = new BufferedReader(inputStreamReader);
            // 用来收集错误信息的
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (errorStream != null) {
                errorStream.close();
            }
            outPutFile2.renameTo(new File(outParentFilePath+"/"+finalName));
        }
    }

    /**
     * 递归函数
     * @param inPath 输入路径
     * @param outPath 输出路径
     * @throws Exception 异常
     */
    public static void getAll(String inPath,String outPath) throws Exception {
        String videoInputPath = "";
        String audioInputPath = "";
        String videoOutPath = "";

        File file = new File(inPath);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                getAll(f.getPath(),outPath);
                if (f.isFile()) {

                    if (f.getName().endsWith("audio.m4s")) {
                        audioInputPath = file.getPath() + "/audio.m4s";
                        videoInputPath = file.getPath() + "/video.m4s";
                        //获取输出的文件名
                        BufferedReader br = new BufferedReader(new FileReader(new File(file.getParentFile().getPath()+"/entry.json")));
                        String fileJson=br.readLine();
                        br.close();
                        //输出文件路径+文件名
                        videoOutPath = outPath+"/"+getFileName(fileJson);
                        System.out.printf("正在合并第%s个视频...\n", ++count);
                        convetor(videoInputPath, audioInputPath, videoOutPath);
                    }

                }

            }

        }
    }

    public static String getFileName(String fileJson){
        String fileName ;
        if (PREFIX_NUM){
            int min = Integer.parseInt(propertiesUtil.getValue("MINI_DIGITS"));
            fileName = fill(BiBiUtils.getVideoIndex(fileJson),min, Byte.MAX_VALUE)+"_"+BiBiUtils.getVideoName(fileJson)+".mp4";
        } else {
            fileName = BiBiUtils.getVideoName(fileJson)+".mp4";
        }
        return fileName;
    }

    public static String fill(int num , int min , int max) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 禁用数字格式化分组。 如：  000,001
        numberFormat.setGroupingUsed(false);
        // 保留最小位数
        numberFormat.setMinimumIntegerDigits(min);
        // 保留最大位数
        numberFormat.setMaximumIntegerDigits(max);
        return numberFormat.format(num);
    }

}
