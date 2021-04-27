/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.proxy.downloader;

import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.ThirdPartyYouTubeLib;
import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.Video;
import java.util.HashMap;

/**
 *
 * @author cdiaz
 */
public class YouTubeDownloader {

    private final ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        list.values().forEach(video -> {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        });
        System.out.println("-------------------------------\n");
    }
}
