/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.bridge.remotes;

import co.edu.utp.isc.progiv.p4.clase19.bridge.devices.Device;

/**
 *
 * @author cdiaz
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Control remoto: Silenciar");
        device.setVolume(0);
    }
}
