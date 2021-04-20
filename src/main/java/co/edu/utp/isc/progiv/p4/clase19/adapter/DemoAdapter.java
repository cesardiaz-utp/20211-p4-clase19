/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.adapter;

import co.edu.utp.isc.progiv.p4.clase19.adapter.adaptadores.PiezaCuadradaAdapter;
import co.edu.utp.isc.progiv.p4.clase19.adapter.circulares.HoyoRedondo;
import co.edu.utp.isc.progiv.p4.clase19.adapter.circulares.PiezaRedonda;
import co.edu.utp.isc.progiv.p4.clase19.adapter.cuadrados.PiezaCuadrada;

/**
 *
 * @author cdiaz
 */
public class DemoAdapter {

    public static void main(String[] args) {
        var hole = new HoyoRedondo(5);
        
        var rpeg = new PiezaRedonda(5);
        if (hole.encaja(rpeg)) {
            System.out.println("Pieza redonda de radio 5 encaja en el hoyo redondo de radio 5.");
        }

        var smallSqPeg = new PiezaCuadrada(2);
        if (hole.encaja(new PiezaCuadradaAdapter(smallSqPeg))) {
            System.out.println("Pieza cuadrada de ancho 2 encaja en el hoyo redondo de radio 5.");
        }

        var largeSqPeg = new PiezaCuadrada(20);
        if (!hole.encaja(new PiezaCuadradaAdapter(largeSqPeg))) {
            System.out.println("Pieza cuadrada de ancho 20 no encaja en el hoyo redondo de radio 5.");
        }
    }
}
