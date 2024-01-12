package com.zjw.work;

import com.zjw.domain.ConvertWrap;

import java.io.*;

/**
 * @author 朱俊伟
 * @date 2023/03/19 0:02
 */
public class Convertor {

    public static void convertor(ConvertWrap convertWrap)
            throws Exception {
        File outPutFile = new File(convertWrap.getVideoOutPath());
        String finalName = outPutFile.getName();
        String outParentFilePath = outPutFile.getParentFile().getPath();
        //当时为啥要做个替换呢？不太记得原因了
        //可能是在执行command命令的时候，有空格的话执行会失败
        String videoOutPath = outParentFilePath+"\\"+finalName.replace(" ","_");
        File outPutFile2 = new File(convertWrap.getVideoOutPath());

        Process process = null;
        InputStream errorStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader br = null;
        try {
            // ffmpeg命令
            String command = "D:/ffmpeg/bin/ffmpeg.exe" + " -i " + convertWrap.getAudioInputPath() + " -i " + convertWrap.getAudioInputPath()
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
}
