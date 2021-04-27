/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.flyweight.forest;

import co.edu.utp.isc.progiv.p4.clase19.flyweight.trees.Tree;
import co.edu.utp.isc.progiv.p4.clase19.flyweight.trees.TreeFactory;
import co.edu.utp.isc.progiv.p4.clase19.flyweight.trees.TreeType;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author cdiaz
 */
public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        trees.forEach(tree -> {
            tree.draw(graphics);
        });
    }
}
