
package youtubedataextractor.videoextractor;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author nandan
 */
public class DataExtractor {

    public DataExtractor() {
    }

    public VideoData getVideoData(String videoUrl) throws IOException {
        Document doc = Jsoup.connect(videoUrl).header("User-Agent", "Chrome").get();
        Element body = doc.body();
        String videoThumbnail = body.getElementsByAttributeValue("itemprop", "thumbnailUrl").get(0).attr("href");
        String videoEmbedUrl = body.getElementsByAttributeValue("itemprop", "embedURL").get(0).attr("href");
        String videoTitle = body.getElementById("eow-title").attr("title");
        String userLink = body.getElementById("watch7-user-header").getElementsByAttributeValue("class", "yt-user-photo yt-uix-sessionlink      spf-link").attr("href");
        String userPhoto = body.getElementById("watch7-user-header").getElementsByTag("img").attr("data-thumb");
        String channelLink = body.getElementById("watch7-user-header").getElementsByClass("yt-user-info").get(0).child(0).attr("href");
        String channelName = body.getElementById("watch7-user-header").getElementsByClass("yt-user-info").get(0).child(0).wholeText();
        boolean isChannelVerified;
        try {
            isChannelVerified = body.getElementById("watch7-user-header").getElementsByClass("yt-user-info").get(0).child(1).attr("aria-label").equalsIgnoreCase("Verified") ? true : false;
        } catch (Exception e) {
            isChannelVerified = false;
        }
        String noOfSubs = body.getElementsByClass("yt-subscription-button-subscriber-count-branded-horizontal yt-subscriber-count").attr("title");
        String viewCount = body.getElementsByClass("watch-view-count").text();
        String noOfLikes = body.getElementsByAttributeValue("title", "I like this").get(0).text();
        String noOfDislikes = body.getElementsByAttributeValue("title", "I dislike this").get(0).text();
        String publishedOn = body.getElementById("watch-uploader-info").text().replace("Published on ", "");
        String description = body.getElementById("watch-description-text").children().text();
        boolean isFamilyFriendly = body.getElementsByAttributeValue("itemprop", "isFamilyFriendly").attr("content").equalsIgnoreCase("True") ? true : false;
        String genre = body.getElementsByAttributeValue("itemprop", "genre").attr("content");
        VideoData videoData=new VideoData(videoThumbnail,videoEmbedUrl,videoTitle,userLink,userPhoto,channelLink,channelName,isChannelVerified,noOfSubs,viewCount,noOfLikes,noOfDislikes,publishedOn,description,isFamilyFriendly,genre);
        return videoData;
    }
}
