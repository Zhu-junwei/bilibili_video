package com.zjw.domain;

public class BiliBili {
    /**
     * media_type : 2
     * has_dash_audio : true
     * is_completed : true
     * total_bytes : 11886524
     * downloaded_bytes : 11886524
     * title : 最新 mybatis-spring-springmvc-Java一站式学习 -java框架-ssm框架-idea-更新完毕
     * type_tag : 80
     * cover : http://i2.hdslb.com/bfs/archive/a2bc1b3d20785c27f14583762bdc933aa74290c8.jpg
     * prefered_video_quality : 80
     * guessed_total_bytes : 0
     * total_time_milli : 243597
     * danmaku_count : 14
     * time_update_stamp : 1588138285330
     * time_create_stamp : 1588137850451
     * can_play_in_advance : true
     * interrupt_transform_temp_file : false
     * avid : 69586111
     * spid : 0
     * seasion_id : 0
     * bvid : BV1mE411X7yp
     * owner_id : 14163840
     * page_data : {"cid":120701733,"page":63,"from":"vupload","part":"Mybatis_63_Day4_mybatis一对多实现延迟加载","vid":"","has_alias":false,"tid":39,"width":1920,"height":1080,"rotate":0,"download_title":"视频已缓存完成","download_subtitle":"最新 mybatis-spring-springmvc-Java一站式学习 -java框架-ssm框架-idea-更新完毕 Mybatis_63_Day4_mybatis一对多实现延迟加载"}
     */

    private int media_type;
    private boolean has_dash_audio;
    private boolean is_completed;
    private int total_bytes;
    private int downloaded_bytes;
    private String title;
    private String type_tag;
    private String cover;
    private int prefered_video_quality;
    private int guessed_total_bytes;
    private int total_time_milli;
    private int danmaku_count;
    private long time_update_stamp;
    private long time_create_stamp;
    private boolean can_play_in_advance;
    private boolean interrupt_transform_temp_file;
    private int avid;
    private int spid;
    private int seasion_id;
    private String bvid;
    private int owner_id;
    private PageDataBean page_data;

    public int getMedia_type() {
        return media_type;
    }

    public void setMedia_type(int media_type) {
        this.media_type = media_type;
    }

    public boolean isHas_dash_audio() {
        return has_dash_audio;
    }

    public void setHas_dash_audio(boolean has_dash_audio) {
        this.has_dash_audio = has_dash_audio;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    public int getTotal_bytes() {
        return total_bytes;
    }

    public void setTotal_bytes(int total_bytes) {
        this.total_bytes = total_bytes;
    }

    public int getDownloaded_bytes() {
        return downloaded_bytes;
    }

    public void setDownloaded_bytes(int downloaded_bytes) {
        this.downloaded_bytes = downloaded_bytes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType_tag() {
        return type_tag;
    }

    public void setType_tag(String type_tag) {
        this.type_tag = type_tag;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPrefered_video_quality() {
        return prefered_video_quality;
    }

    public void setPrefered_video_quality(int prefered_video_quality) {
        this.prefered_video_quality = prefered_video_quality;
    }

    public int getGuessed_total_bytes() {
        return guessed_total_bytes;
    }

    public void setGuessed_total_bytes(int guessed_total_bytes) {
        this.guessed_total_bytes = guessed_total_bytes;
    }

    public int getTotal_time_milli() {
        return total_time_milli;
    }

    public void setTotal_time_milli(int total_time_milli) {
        this.total_time_milli = total_time_milli;
    }

    public int getDanmaku_count() {
        return danmaku_count;
    }

    public void setDanmaku_count(int danmaku_count) {
        this.danmaku_count = danmaku_count;
    }

    public long getTime_update_stamp() {
        return time_update_stamp;
    }

    public void setTime_update_stamp(long time_update_stamp) {
        this.time_update_stamp = time_update_stamp;
    }

    public long getTime_create_stamp() {
        return time_create_stamp;
    }

    public void setTime_create_stamp(long time_create_stamp) {
        this.time_create_stamp = time_create_stamp;
    }

    public boolean isCan_play_in_advance() {
        return can_play_in_advance;
    }

    public void setCan_play_in_advance(boolean can_play_in_advance) {
        this.can_play_in_advance = can_play_in_advance;
    }

    public boolean isInterrupt_transform_temp_file() {
        return interrupt_transform_temp_file;
    }

    public void setInterrupt_transform_temp_file(boolean interrupt_transform_temp_file) {
        this.interrupt_transform_temp_file = interrupt_transform_temp_file;
    }

    public int getAvid() {
        return avid;
    }

    public void setAvid(int avid) {
        this.avid = avid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getSeasion_id() {
        return seasion_id;
    }

    public void setSeasion_id(int seasion_id) {
        this.seasion_id = seasion_id;
    }

    public String getBvid() {
        return bvid;
    }

    public void setBvid(String bvid) {
        this.bvid = bvid;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public PageDataBean getPage_data() {
        return page_data;
    }

    public void setPage_data(PageDataBean page_data) {
        this.page_data = page_data;
    }

    public static class PageDataBean {
        /**
         * cid : 120701733
         * page : 63
         * from : vupload
         * part : Mybatis_63_Day4_mybatis一对多实现延迟加载
         * vid :
         * has_alias : false
         * tid : 39
         * width : 1920
         * height : 1080
         * rotate : 0
         * download_title : 视频已缓存完成
         * download_subtitle : 最新 mybatis-spring-springmvc-Java一站式学习 -java框架-ssm框架-idea-更新完毕 Mybatis_63_Day4_mybatis一对多实现延迟加载
         */

        private int cid;
        private int page;
        private String from;
        private String part;
        private String vid;
        private boolean has_alias;
        private int tid;
        private int width;
        private int height;
        private int rotate;
        private String download_title;
        private String download_subtitle;

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getPart() {
            return part;
        }

        public void setPart(String part) {
            this.part = part;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public boolean isHas_alias() {
            return has_alias;
        }

        public void setHas_alias(boolean has_alias) {
            this.has_alias = has_alias;
        }

        public int getTid() {
            return tid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getRotate() {
            return rotate;
        }

        public void setRotate(int rotate) {
            this.rotate = rotate;
        }

        public String getDownload_title() {
            return download_title;
        }

        public void setDownload_title(String download_title) {
            this.download_title = download_title;
        }

        public String getDownload_subtitle() {
            return download_subtitle;
        }

        public void setDownload_subtitle(String download_subtitle) {
            this.download_subtitle = download_subtitle;
        }

        @Override
        public String toString() {
            return "PageDataBean{" +
                    "cid=" + cid +
                    ", page=" + page +
                    ", from='" + from + '\'' +
                    ", part='" + part + '\'' +
                    ", vid='" + vid + '\'' +
                    ", has_alias=" + has_alias +
                    ", tid=" + tid +
                    ", width=" + width +
                    ", height=" + height +
                    ", rotate=" + rotate +
                    ", download_title='" + download_title + '\'' +
                    ", download_subtitle='" + download_subtitle + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BiliBili{" +
                "media_type=" + media_type +
                ", has_dash_audio=" + has_dash_audio +
                ", is_completed=" + is_completed +
                ", total_bytes=" + total_bytes +
                ", downloaded_bytes=" + downloaded_bytes +
                ", title='" + title + '\'' +
                ", type_tag='" + type_tag + '\'' +
                ", cover='" + cover + '\'' +
                ", prefered_video_quality=" + prefered_video_quality +
                ", guessed_total_bytes=" + guessed_total_bytes +
                ", total_time_milli=" + total_time_milli +
                ", danmaku_count=" + danmaku_count +
                ", time_update_stamp=" + time_update_stamp +
                ", time_create_stamp=" + time_create_stamp +
                ", can_play_in_advance=" + can_play_in_advance +
                ", interrupt_transform_temp_file=" + interrupt_transform_temp_file +
                ", avid=" + avid +
                ", spid=" + spid +
                ", seasion_id=" + seasion_id +
                ", bvid='" + bvid + '\'' +
                ", owner_id=" + owner_id +
                ", page_data=" + page_data +
                '}';
    }
}
