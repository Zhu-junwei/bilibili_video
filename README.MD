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

运行前修改config.properties中的参数
```properties
# ffmpeg文件的位置
FFMPEG_PATH = D:/ffmpeg/bin/ffmpeg.exe
# 下载的音视频位置
IN_PATH = F:/425540552
# 合并后文件的路径
OUT_PATH = F:/SpringBoot教程
# 合并后的文件名时候加数字前缀
PREFIX_NUM = true
# 设置数字前缀的最少位数，设置为3时文件名格式为“001_+文件名”
MINI_DIGITS = 3
```

## Q&A

- 解析失败了怎么办？

> 你可能需要debug哪一步错了。