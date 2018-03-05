
package youtubedataextractor;

import java.util.ArrayList;
import java.util.Iterator;
import youtubedataextractor.searchextractor.SearchExtractor;
import youtubedataextractor.searchextractor.SearchResult;
import youtubedataextractor.videoextractor.DataExtractor;
import youtubedataextractor.videoextractor.VideoData;

/**
 *
 * @author nandan
 */
public class YouTubeDataExtractorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            /*
            SearchExtractor sp=new SearchExtractor();
            ArrayList<SearchResult> sr=sp.getSearchResults("arduino working");
            Iterator it=sr.iterator();
            SearchResult s;
            while(it.hasNext()){
                s=(SearchResult)it.next();
                System.out.println("Video title: "+s.getVideoTitle());
                System.out.println("Video link: "+s.getVideoLink());
                System.out.println("Video views: "+s.getVideoViews());
                System.out.println("Video duration: "+s.getVideoDuration());
                System.out.println("Video channel name: "+s.getVideoChannelName());
                System.out.println("Video channel link: "+s.getVideoChannelLink());
                System.out.println("Video channel verified: "+s.getVideoChannelVerified());
                System.out.println("Video date: "+s.getVideoDate());
                System.out.println("Video thumbnail: "+s.getVideoThumbnailUrl());
                System.out.println();
                System.out.println();
            }
            */
            
            DataExtractor de=new DataExtractor();
            VideoData vd=de.getVideoData("https://www.youtube.com/watch?v=0t2tjNqGyJI");
            System.out.println("Video thumbnail url: "+vd.getThumbnailUrl());
            System.out.println("Embed video url: "+vd.getEmbedUrl());
            System.out.println("Video title: "+vd.getTitle());
            System.out.println("Uploader's profile link: "+vd.getUserProfileLink());
            System.out.println("Uploader's profile photo url: "+vd.getUserPhotoUrl());
            System.out.println("Channel link: "+vd.getChannelLink());
            System.out.println("Channel name: "+vd.getChannelName());
            System.out.println("Channel verified: "+vd.getIsChannelVerified());
            System.out.println("No of subs: "+vd.getNoOfSubs());
            System.out.println("Views: "+vd.getNoOfViews());
            System.out.println("No of likes: "+vd.getNoOfLikes());
            System.out.println("No of dislikes: "+vd.getNoOfDislikes());
            System.out.println("Published on: "+vd.getPublishedOn());
            System.out.println("Video description: "+vd.getDescription());
            System.out.println("Family friendly: "+vd.getIsFamilyFriendly());
            System.out.println("Genre: "+vd.getGenre());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
