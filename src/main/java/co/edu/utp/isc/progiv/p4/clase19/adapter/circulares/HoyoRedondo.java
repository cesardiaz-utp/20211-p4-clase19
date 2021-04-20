/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.adapter.circulares;

/**
 *
 * @author cdiaz
 */
public class HoyoRedondo {

    private double radio;

    public HoyoRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encaja(PiezaRedonda peg) {
        boolean result;
        result = (this.getRadio() >= peg.getRadio());
        return result;
    }
}
