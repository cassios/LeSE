/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.view.interfaces.AbstractComponent;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author bruno
 */
public class ComponentHouseView extends AbstractComponent {

    private GridBagConstraints c;
    private static final String IMAGE_QUESTION = "../images/question.png";
    private static final String IMAGE_JOKER = "../images/joker.png";
    private static final String IMAGE_START = "../images/start.png";
    private int codeHouse = 0;

    public ComponentHouseView() {
    }

    @Override
    public void addComponent(AbstractComponent component) {
        component.container = getContentPane();
        component.container.setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        createBotton(component);
        createLeft(component);
        createTop(component);
        createRight(component);

    }

    public void createTop(AbstractComponent component) {
        int y = 1;
        for (int x = 1; x < 10; x++) {
            if (this.codeHouse % 3 == 0) {
                createJoker(component, x, y, this.codeHouse, 1, 1, 1, 0);
            } else {
                createQuestion(component, x, y, this.codeHouse, 1, 1, 1, 0);
            }
            this.codeHouse++;
        }
    }

    public void createLeft(AbstractComponent component) {
        int x = 1;
        for (int y = 10; y > 1; y--) {
            if (this.codeHouse % 3 == 0) {
                createJoker(component, x, y, this.codeHouse, 0, 1, 1, 1);
            } else {
                createQuestion(component, x, y, this.codeHouse, 0, 1, 1, 1);
            }
            this.codeHouse++;
        }
    }

    public void createBotton(AbstractComponent component) {
        int y = 10;
        for (int x = 10; x > 1; x--) {
            if (x == 10) {
                createStart(component, x, y, this.codeHouse, 1, 0, 1, 1);
            } else if (this.codeHouse % 3 == 0) {
                createJoker(component, x, y, this.codeHouse, 1, 0, 1, 1);
            } else {
                createQuestion(component, x, y, this.codeHouse, 1, 0, 1, 1);
            }
            this.codeHouse++;
        }
    }

    public void createRight(AbstractComponent component) {
        int x = 10;
        for (int y = 1; y < 10; y++) {
            if (this.codeHouse % 3 == 0) {
                createJoker(component, x, y, this.codeHouse, 1, 1, 0, 1);
            } else {
                createQuestion(component, x, y, this.codeHouse, 1, 1, 0, 1);
            }
            this.codeHouse++;
        }
    }

    public void createStart(AbstractComponent component, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight) {
        ImageIcon imageStart = new ImageIcon(getClass().getResource(IMAGE_START));
        JLabel label = new JLabel(imageStart);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(Color.white);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        component.container.add(label, c);
    }

    public void createQuestion(AbstractComponent component, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight) {
        ImageIcon imageQuestion = new ImageIcon(getClass().getResource(IMAGE_QUESTION));
        JLabel label = new JLabel(imageQuestion);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(Color.white);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        component.container.add(label, c);
    }

    public void createJoker(AbstractComponent component, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight) {
        ImageIcon imageJoker = new ImageIcon(getClass().getResource(IMAGE_JOKER));
        JLabel label = new JLabel(imageJoker);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(Color.white);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        component.container.add(label, c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //not used.
    }

}
