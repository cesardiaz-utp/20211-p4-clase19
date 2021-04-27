/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.proxy.proxy;

import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.ThirdPartyYouTubeClass;
import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.ThirdPartyYouTubeLib;
import co.edu.utp.isc.progiv.p4.clase19.proxy.medialibrary.Video;
import java.util.HashMap;

/**
 *
 * @author cdiaz
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
