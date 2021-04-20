/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.adapter.cuadrados;

/**
 *
 * @author cdiaz
 */
public class PiezaCuadrada {

    private final double ancho;

    public PiezaCuadrada(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getCuadrado() {
        double result;
        result = Math.pow(this.ancho, 2);
        return result;
    }
}
