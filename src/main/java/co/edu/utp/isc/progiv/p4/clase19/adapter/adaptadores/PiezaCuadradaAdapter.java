/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.adapter.adaptadores;

import co.edu.utp.isc.progiv.p4.clase19.adapter.circulares.PiezaRedonda;
import co.edu.utp.isc.progiv.p4.clase19.adapter.cuadrados.PiezaCuadrada;

/**
 *
 * @author cdiaz
 */
public class PiezaCuadradaAdapter extends PiezaRedonda {

    private final PiezaCuadrada peg;

    public PiezaCuadradaAdapter(PiezaCuadrada peg) {
        this.peg = peg;
    }

    @Override
    public double getRadio() {
        double result;
        // Calcular el radio del circulo mínimo en el cual encaja la figura
        result = (Math.sqrt(Math.pow((peg.getAncho() / 2), 2) * 2));
        return result;
    }
}
