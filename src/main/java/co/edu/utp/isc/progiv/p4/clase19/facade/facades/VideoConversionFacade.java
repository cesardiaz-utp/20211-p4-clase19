/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.facade.facades;

import co.edu.utp.isc.progiv.p4.clase19.facade.complexmedialibrary.AudioMixer;
import co.edu.utp.isc.progiv.p4.clase19.facade.complexmedialibrary.BitrateReader;
import co.edu.utp.isc.progiv.p4.clase19.facade.complexmedialibrary.CodecFactory;
import co.edu.utp.isc.progiv.p4.clase19.facade.complexmedialibrary.VideoFile;
import java.io.File;

/**
 *
 * @author cdiaz
 */
public class VideoConversionFacade {
    
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        
        VideoFile file = new VideoFile(fileName);
        var sourceCodec = CodecFactory.extract(file);
        
        var destinationCodec = CodecFactory.generateCodec(format);

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
