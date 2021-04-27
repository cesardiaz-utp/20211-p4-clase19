/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.composite;

import co.edu.utp.isc.progiv.p4.clase19.composite.editor.ImageEditor;
import co.edu.utp.isc.progiv.p4.clase19.composite.shapes.Circle;
import co.edu.utp.isc.progiv.p4.clase19.composite.shapes.CompoundShape;
import co.edu.utp.isc.progiv.p4.clase19.composite.shapes.Dot;
import co.edu.utp.isc.progiv.p4.clase19.composite.shapes.Rectangle;
import java.awt.Color;

/**
 *
 * @author cdiaz
 */
public class DemoComposite {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
