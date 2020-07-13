package com.zjw.domain;

public class BiliBiliSingle {

    /**
     * media_type : 2
     * has_dash_audio : true
     * is_completed : true
     * total_bytes : 192960307
     * downloaded_bytes : 192960307
     * title : Vol.120 二维码的秘密
     * type_tag : 80
     * cover : http://i0.hdslb.com/bfs/archive/26c1fde0bf1faa698f246fbd21ca6f8e3338c1d9.jpg
     * prefered_video_quality : 80
     * guessed_total_bytes : 0
     * total_time_milli : 805013
     * danmaku_count : 1500
     * time_update_stamp : 1589561384035
     * time_create_stamp : 1589561319457
     * can_play_in_advance : true
     * interrupt_transform_temp_file : false
     * avid : 840739954
     * spid : 0
     * seasion_id : 0
     * bvid : BV1Y54y1D7cT
     * owner_id : 258150656
     * page_data : {"cid":190197542,"page":1,"from":"vupload","has_alias":false,"tid":0,"width":1920,"height":1080,"rotate":0}
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
         * cid : 190197542
         * page : 1
         * from : vupload
         * has_alias : false
         * tid : 0
         * width : 1920
         * height : 1080
         * rotate : 0
         */

        private int cid;
        private int page;
        private String from;
        private boolean has_alias;
        private int tid;
        private int width;
        private int height;
        private int rotate;

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
    }
}
