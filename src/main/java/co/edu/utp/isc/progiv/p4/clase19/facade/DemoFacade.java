/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.facade;

import co.edu.utp.isc.progiv.p4.clase19.facade.facades.VideoConversionFacade;
import java.io.File;

/**
 *
 * @author cdiaz
 */
public class DemoFacade {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
