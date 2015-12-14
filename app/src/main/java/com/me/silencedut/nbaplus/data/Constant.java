package com.me.silencedut.nbaplus.data;

/**
 * Created by SilenceDut on 2015/11/28.
 */
public class Constant {

    public static final String APP_FIR_IM_URL="http://fir.im/nbaplus";

    public static final String LOADIMAGE = "LOADIMAGE";
    public static final String ACTILEFONTSIZE = "ACTILEFONTSIZE";

    public static final String CSS_STYLE ="<style>* {font-size:%spx;line-height:28px;}p {color:%s;}</style>";

    public enum NEWSTYPE {
        NEWS("news"),BLOG("blog");
        private String newsType;
        NEWSTYPE(String newsType) {
            this.newsType=newsType;
        }
        public String getNewsType() {
            return newsType;
        }
    }

    public enum GETNEWSWAY {
        INIT,UPDATE,LOADMORE;
    }

    public enum Result {
        SUCCESS,FAIL,NORMAL;
    }

}
