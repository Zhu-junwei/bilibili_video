# 合并哔哩哔哩下载的音视频工具

## 简介
通过ffmpeg批量合并音视频文件，重命名文件，自定义合成文件路径。

## 使用说明
### 前期准备

- 安装 [ffmpeg](https://ffmpeg.org/) 工具。
### 拷贝下载哔哩哔哩文件至电脑

**bilibili默认缓存路径 \Android\data\tv.danmaku.bili\download**

需要用到缓存里的下列文件

- audio.m4s -> 视频文件

- video.m4s -> 音频文件

- entry.json -> 视频信息

### 运行Main.java中的main方法

你可能需要修改main方法中的几个参数
```java
    // FFmpeg全路径
    private static final String FFMPEG_PATH = "D:\\ffmpeg\\bin\\ffmpeg.exe";
    //音视频文件的位置
    private static String IN_PATH = "F:\\教程\\54095344";
    //输出文件的位置
    private static String OUT_PATH = "F:\\教程\\韩顺平数据结构\\";
```

## Q&A

- 解析失败了怎么办？

> 你可能需要debug哪一步错了。