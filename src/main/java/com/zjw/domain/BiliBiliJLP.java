package com.zjw.domain;

public class BiliBiliJLP {
    /**
     * media_type : 2
     * has_dash_audio : true
     * is_completed : true
     * total_bytes : 409782181
     * downloaded_bytes : 409782181
     * title : 今日说法
     * type_tag : 80
     * cover : http://i0.hdslb.com/bfs/archive/d96d4546a79eb2a03f124095c79703572fef7e1f.jpg
     * prefered_video_quality : 80
     * guessed_total_bytes : 0
     * total_time_milli : 1674168
     * danmaku_count : 0
     * time_update_stamp : 1589520252068
     * time_create_stamp : 1589519781679
     * can_play_in_advance : true
     * interrupt_transform_temp_file : false
     * season_id : 28898
     * source : {"av_id":66981484,"cid":116148316,"website":"bangumi"}
     * ep : {"av_id":66981484,"page":0,"danmaku":116148316,"cover":"http://i0.hdslb.com/bfs/archive/d96d4546a79eb2a03f124095c79703572fef7e1f.jpg","episode_id":289650,"index":"001","index_title":"美容院里的\u201c抗癌药\u201d","from":"bangumi","season_type":3,"width":1920,"height":1080,"rotate":0,"link":"https://www.bilibili.com/bangumi/play/ep289650","bvid":"BV1g4411C7iD"}
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
    private String season_id;
    private SourceBean source;
    private EpBean ep;

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

    public String getSeason_id() {
        return season_id;
    }

    public void setSeason_id(String season_id) {
        this.season_id = season_id;
    }

    public SourceBean getSource() {
        return source;
    }

    public void setSource(SourceBean source) {
        this.source = source;
    }

    public EpBean getEp() {
        return ep;
    }

    public void setEp(EpBean ep) {
        this.ep = ep;
    }

    public static class SourceBean {
        /**
         * av_id : 66981484
         * cid : 116148316
         * website : bangumi
         */

        private int av_id;
        private int cid;
        private String website;

        public int getAv_id() {
            return av_id;
        }

        public void setAv_id(int av_id) {
            this.av_id = av_id;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }
    }

    public static class EpBean {
        /**
         * av_id : 66981484
         * page : 0
         * danmaku : 116148316
         * cover : http://i0.hdslb.com/bfs/archive/d96d4546a79eb2a03f124095c79703572fef7e1f.jpg
         * episode_id : 289650
         * index : 001
         * index_title : 美容院里的“抗癌药”
         * from : bangumi
         * season_type : 3
         * width : 1920
         * height : 1080
         * rotate : 0
         * link : https://www.bilibili.com/bangumi/play/ep289650
         * bvid : BV1g4411C7iD
         */

        private int av_id;
        private int page;
        private int danmaku;
        private String cover;
        private int episode_id;
        private String index;
        private String index_title;
        private String from;
        private int season_type;
        private int width;
        private int height;
        private int rotate;
        private String link;
        private String bvid;

        public int getAv_id() {
            return av_id;
        }

        public void setAv_id(int av_id) {
            this.av_id = av_id;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getDanmaku() {
            return danmaku;
        }

        public void setDanmaku(int danmaku) {
            this.danmaku = danmaku;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getEpisode_id() {
            return episode_id;
        }

        public void setEpisode_id(int episode_id) {
            this.episode_id = episode_id;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getIndex_title() {
            return index_title;
        }

        public void setIndex_title(String index_title) {
            this.index_title = index_title;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public int getSeason_type() {
            return season_type;
        }

        public void setSeason_type(int season_type) {
            this.season_type = season_type;
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

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getBvid() {
            return bvid;
        }

        public void setBvid(String bvid) {
            this.bvid = bvid;
        }
    }
}
