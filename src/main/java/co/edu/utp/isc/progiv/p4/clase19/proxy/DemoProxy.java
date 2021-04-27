/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.proxy;

import co.edu.utp.isc.progiv.p4.clase19.proxy.downloader.YouTubeDownloader;
import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.ThirdPartyYouTubeClass;
import co.edu.utp.isc.progiv.p4.clase19.proxy.proxy.YouTubeCacheProxy;

/**
 *
 * @author cdiaz
 */
public class DemoProxy {
    public static void main(String[] args) {
        var naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        var smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
