/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubedataextractor.videoextractor;

/**
 *
 * @author nandan
 */
public class VideoData {
    private String thumbnailUrl;
    private String embedUrl;
    private String title;
    private String userProfileLink;
    private String userPhotoUrl;
    private String channelLink;
    private String channelName;
    private boolean isChannelVerified;
    private String noOfSubs;
    private String noOfViews;
    private String noOfLikes;
    private String noOfDislikes;
    private String publishedOn;
    private String description;
    private boolean isFamilyFriendly;
    private String genre;
    
    public VideoData(String thumbnailUrl,String embedUrl,String title,String userProfileLink,String userPhotoUrl,String channelLink,String channelName,boolean isChannelVerified,String noOfSubs,String noOfViews,String noOfLikes,String noOfDislikes,String publishedOn,String description,boolean isFamilyFriendly,String genre){
        this.thumbnailUrl=thumbnailUrl;
        this.embedUrl=embedUrl;
        this.title=title;
        this.userProfileLink=userProfileLink;
        this.userPhotoUrl=userPhotoUrl;
        this.channelLink=channelLink;
        this.channelName=channelName;
        this.isChannelVerified=isChannelVerified;
        this.noOfSubs=noOfSubs;
        this.noOfViews=noOfViews;
        this.noOfLikes=noOfLikes;
        this.noOfDislikes=noOfDislikes;
        this.publishedOn=publishedOn;
        this.description=description;
        this.isFamilyFriendly=isFamilyFriendly;
        this.genre=genre;
    }
    
    public String getThumbnailUrl(){
        return thumbnailUrl;
    }
    public String getEmbedUrl(){
        return embedUrl;
    }
    public String getTitle(){
        return title;
    }
    public String getUserProfileLink(){
        return userProfileLink;
    }
    public String getUserPhotoUrl(){
        return userPhotoUrl;
    }
    public String getChannelLink(){
        return channelLink;
    }
    public String getChannelName(){
        return channelName;
    }
    public boolean getIsChannelVerified(){
        return isChannelVerified;
    }
    public String getNoOfSubs(){
        return noOfSubs;
    }
    public String getNoOfViews(){
        return noOfViews;
    }
    public String getNoOfLikes(){
        return noOfLikes;
    }
    public String getNoOfDislikes(){
        return noOfDislikes;
    }
    public String getPublishedOn(){
        return publishedOn;
    }
    public String getDescription(){
        return description;
    }
    public boolean getIsFamilyFriendly(){
        return isFamilyFriendly;
    }
    public String getGenre(){
        return genre;
    }
}
