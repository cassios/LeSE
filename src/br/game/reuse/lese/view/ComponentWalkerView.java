/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.view.interfaces.AbstractComponent;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author bruno
 */
public class ComponentWalkerView extends AbstractComponent {

    public JLabel label;
    private static final String IMAGE_QUESTION = "../images/questionWalker.png";
    private static final String IMAGE_JOKER = "../images/jokerWalker.png";
    private static final String IMAGE_START = "../images/startWalker.png";

    public ComponentWalkerView() {
        if (label == null) {
            label = new JLabel();
        }
    }

    @Override
    public void addComponent(AbstractComponent component) {
        Component[] comps = component.container.getComponents();
        Component comp = null;
        for (Component c : comps) {
            if (c instanceof JLabel) {
                String name = "house" + component.code;
//                System.out.println(c.getName());
                if (c.getName().equals(name)) {
                    comp = c;
                }
            }
        }
        component.container.remove(comp);
        component.container.remove(label);
        ImageIcon imageStart = new ImageIcon(getClass().getResource(IMAGE_QUESTION));
        label = new JLabel(imageStart);
        label.setOpaque(true);
        label.setBackground(Color.white);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
//        c.gridx = component.positionX;
//        c.gridy = component.positionY;
        component.container.add(label, c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
