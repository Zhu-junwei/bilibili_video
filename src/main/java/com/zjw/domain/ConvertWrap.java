package com.zjw.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 朱俊伟
 * @date 2023/03/19 0:09
 */
@Data
@AllArgsConstructor
public class ConvertWrap {
    /**
     * 原视频的全路径
     */
    private String videoInputPath;

    /**
     * 音频的全路径
     */
    private String audioInputPath;

    /**
     * 视频与音频结合之后的视频的路径
     */
    private String videoOutPath;

}
