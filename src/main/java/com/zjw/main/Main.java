package com.zjw.main;

import com.zjw.utils.BiBiUtils;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    // FFmpeg全路径
    private static final String FFMPEG_PATH = "D:\\ffmpeg\\bin\\ffmpeg.exe";
    //音视频文件的位置
//    private static final String IN_PATH = "F:\\电影\\s_2546";
    private static String IN_PATH = "D:\\系统文件夹\\桌面\\21400736";
    //输出文件的位置
//    private static final String OUT_PATH = "F:\\电影\\";
    private static String OUT_PATH = "F:\\教程\\mysql\\";



    public static void main(String[] args) {

        File file = new File(OUT_PATH);
        if (!file.exists()){
            file.mkdirs();
        }
        try {
            getAll(IN_PATH,OUT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            outPutFile2.renameTo(new File(outParentFilePath+"\\"+finalName));
        }
    }
    // 递归函数
    public static void getAll(String in_path,String out_path) throws Exception {
        String videoInputPath = "";
        String audioInputPath = "";
        String videoOutPath = "";

        File file = new File(in_path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                getAll(f.getPath(),out_path);
                if (f.isFile()) {

                    if (f.getName().endsWith(".m4s")) {

                        if (f.getName().endsWith("audio.m4s"))
                            audioInputPath = file.getPath() + "\\audio.m4s";
                        if (f.getName().endsWith("video.m4s"))
                            videoInputPath = file.getPath() + "\\video.m4s";
//                        videoOutPath = file.getPath() + "\\all.mp4";
                        videoOutPath = out_path;

                        //获取输出的文件名
                        BufferedReader br = new BufferedReader(new FileReader(new File(file.getParentFile().getPath()+"\\entry.json")));
                        String fileJson=br.readLine();
                        br.close();

                        //加数字前缀
//                        String fileName = fill(BiBiUtils.getVideoIndex(fileJson),3,3)+"_"+BiBiUtils.getVideoName(fileJson)+".mp4";
                        //不加前缀
                        String fileName = BiBiUtils.getVideoName(fileJson)+".mp4";
                        videoOutPath = videoOutPath+fileName;

                        if (!videoInputPath.equals(""))
                            convetor(videoInputPath, audioInputPath, videoOutPath);

                    }

                }

            }

        }
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
