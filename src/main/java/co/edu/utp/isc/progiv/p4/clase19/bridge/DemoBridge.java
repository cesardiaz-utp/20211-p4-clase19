/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.bridge;

import co.edu.utp.isc.progiv.p4.clase19.bridge.devices.Device;
import co.edu.utp.isc.progiv.p4.clase19.bridge.devices.Radio;
import co.edu.utp.isc.progiv.p4.clase19.bridge.devices.Tv;
import co.edu.utp.isc.progiv.p4.clase19.bridge.remotes.AdvancedRemote;
import co.edu.utp.isc.progiv.p4.clase19.bridge.remotes.BasicRemote;

/**
 *
 * @author cdiaz
 */
public class DemoBridge {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Pruebas con el control básico.");
        var basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Pruebas con el control avanzado.");
        var advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
