/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubedataextractor.searchextractor;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author nandan
 */
public class SearchExtractor {
    public SearchExtractor() {
    }

    public ArrayList<SearchResult> getSearchResults(String query) throws UnsupportedEncodingException, IOException {
        ArrayList<SearchResult> searchResults = new ArrayList<>();
        Element elTitle;
        String vidTitle;
        String vidLink;
        String vidDuration;
        String vidChannel;
        String vidChannelLink;
        boolean isVerifiedChannel;
        String vidDate;
        String vidViews;
        String thumbnail;
        SearchResult searchResult;
        Document doc = Jsoup.connect("https://www.youtube.com/results?search_query=" + URLEncoder.encode(query, "UTF-8")).header("User-Agent", "Chrome").get();
        Element body = doc.body();
        Elements elsContents = body.getElementsByClass("yt-lockup-content");
        for (Element elcon : elsContents) {
            elTitle = elcon.getElementsByClass("yt-lockup-title").get(0);
            vidTitle = elTitle.getElementsByTag("a").get(0).attr("title");
            vidLink = elTitle.getElementsByTag("a").get(0).attr("href");
            vidDuration = elTitle.getElementsByTag("span").get(0).wholeText();
            vidChannel = elcon.getElementsByAttributeValue("class", "yt-lockup-byline").tagName("a").text();
            vidChannelLink = elcon.getElementsByAttributeValue("class", "yt-uix-sessionlink       spf-link").attr("href");
            isVerifiedChannel = elcon.getElementsByAttributeValue("class", "yt-uix-sessionlink       spf-link").next().attr("title").equalsIgnoreCase("Verified") ? true : false;
            if (elcon.getElementsByAttributeValue("class", "yt-lockup-meta-info").size() != 0) {
                vidDate = elcon.getElementsByAttributeValue("class", "yt-lockup-meta-info").get(0).getElementsByTag("li").first().text();
                vidViews = elcon.getElementsByAttributeValue("class", "yt-lockup-meta-info").get(0).getElementsByTag("li").next().text();
            } else {
                vidDate = null;
                vidViews = null;
            }
            thumbnail=elcon.previousElementSibling().getElementsByClass("yt-thumb-simple").get(0).getElementsByTag("img").attr("data-thumb");//.getElementsByTag("img").attr("data-thumb");
            if(thumbnail.isEmpty()){
                thumbnail=elcon.previousElementSibling().getElementsByClass("yt-thumb-simple").get(0).getElementsByTag("img").attr("src");
            }
            searchResult = new SearchResult(vidTitle, vidLink, vidDuration, vidChannel, vidChannelLink, isVerifiedChannel, vidViews, vidDate,thumbnail);
            searchResults.add(searchResult);

        }
        return searchResults;
    }
}
