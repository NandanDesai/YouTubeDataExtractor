
package youtubedataextractor.searchextractor;

/**
 *
 * @author nandan
 */
public class SearchResult {
    private String videoTitle;
    private String videoLink;
    private String videoDuration;
    private String videoChannelName;
    private String videoChannelLink;
    private boolean videoChannelVerified;
    private String videoViews;
    private String videoDate;
    private String thumbnailUrl;
    public SearchResult(String videoTitle,String videoLink,String videoDuration,String videoChannelName,String videoChannelLink,boolean videoChannelVerified,String videoViews,String videoDate,String thumbnailUrl){
        this.videoTitle=videoTitle;
        this.videoLink=videoLink;
        this.videoDuration=videoDuration;
        this.videoChannelName=videoChannelName;
        this.videoChannelLink=videoChannelLink;
        this.videoChannelVerified=videoChannelVerified;
        this.videoDate=videoDate;
        this.videoViews=videoViews;
        this.thumbnailUrl=thumbnailUrl;
    }
    public String getVideoTitle(){
        return videoTitle;
    }
    public String getVideoLink(){
        return videoLink;
    }
    public String getVideoDuration(){
        return videoDuration;
    }
    public String getVideoChannelName(){
        return videoChannelName;
    }
    public String getVideoChannelLink(){
        return videoChannelLink;
    }
    public boolean getVideoChannelVerified(){
        return videoChannelVerified;
    }
    public String getVideoViews(){
        return videoViews;
    }
    public String getVideoDate(){
        return videoDate;
    }
    public String getVideoThumbnailUrl(){
        return thumbnailUrl;
    }
}
