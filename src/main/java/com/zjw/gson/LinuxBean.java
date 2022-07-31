package com.zjw.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 朱俊伟
 * @date 2021/05/31
 */
@lombok.NoArgsConstructor
@lombok.Data
public class LinuxBean {
    @SerializedName("media_type")
    private Integer mediaType;
    @SerializedName("has_dash_audio")
    private Boolean hasDashAudio;
    @SerializedName("is_completed")
    private Boolean isCompleted;
    @SerializedName("total_bytes")
    private Integer totalBytes;
    @SerializedName("downloaded_bytes")
    private Integer downloadedBytes;
    @SerializedName("title")
    private String title;
    @SerializedName("type_tag")
    private String typeTag;
    @SerializedName("cover")
    private String cover;
    @SerializedName("video_quality")
    private Integer videoQuality;
    @SerializedName("prefered_video_quality")
    private Integer preferedVideoQuality;
    @SerializedName("guessed_total_bytes")
    private Integer guessedTotalBytes;
    @SerializedName("total_time_milli")
    private Integer totalTimeMilli;
    @SerializedName("danmaku_count")
    private Integer danmakuCount;
    @SerializedName("time_update_stamp")
    private Long timeUpdateStamp;
    @SerializedName("time_create_stamp")
    private Long timeCreateStamp;
    @SerializedName("can_play_in_advance")
    private Boolean canPlayInAdvance;
    @SerializedName("interrupt_transform_temp_file")
    private Boolean interruptTransformTempFile;
    @SerializedName("quality_pithy_description")
    private String qualityPithyDescription;
    @SerializedName("quality_superscript")
    private String qualitySuperscript;
    @SerializedName("cache_version_code")
    private Integer cacheVersionCode;
    @SerializedName("preferred_audio_quality")
    private Integer preferredAudioQuality;
    @SerializedName("audio_quality")
    private Integer audioQuality;
    @SerializedName("avid")
    private Integer avid;
    @SerializedName("spid")
    private Integer spid;
    @SerializedName("seasion_id")
    private Integer seasionId;
    @SerializedName("bvid")
    private String bvid;
    @SerializedName("owner_id")
    private Integer ownerId;
    @SerializedName("page_data")
    private PageDataDTO pageData;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class PageDataDTO {
        @SerializedName("cid")
        private Integer cid;
        @SerializedName("page")
        private Integer page;
        @SerializedName("from")
        private String from;
        @SerializedName("part")
        private String part;
        @SerializedName("link")
        private String link;
        @SerializedName("vid")
        private String vid;
        @SerializedName("has_alias")
        private Boolean hasAlias;
        @SerializedName("tid")
        private Integer tid;
        @SerializedName("width")
        private Integer width;
        @SerializedName("height")
        private Integer height;
        @SerializedName("rotate")
        private Integer rotate;
        @SerializedName("download_title")
        private String downloadTitle;
        @SerializedName("download_subtitle")
        private String downloadSubtitle;
    }
}
