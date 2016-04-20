/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.view.interfaces.AbstractComponent;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class ComponentDiceView extends AbstractComponent {

    private JTextField text;
    private JButton button;
    private int score = 0;

    @Override
    public void addComponent(AbstractComponent component) {
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        ImageIcon imageStart = new ImageIcon(getClass().getResource("../images/start.png"));
        JLabel label = new JLabel("Pontuação: ");
        text = new JTextField(15);
        label.setFont(new java.awt.Font("Dialog", 1, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        text.setMaximumSize(new Dimension(1, 100));
        text.setMinimumSize(new Dimension(1, 100));
        text.setFont(new java.awt.Font("Dialog", 1, 50));
        text.setText(String.valueOf(component.score));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setEnabled(false);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 4;
        c.gridheight = 3;
        component.container.add(text, c);

        button = new JButton("Sortear");
        button.addActionListener(this);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 5;
        component.container.add(button, c);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.button) {
            int valueDice = 1 + (int) (Math.random() * 4);
            this.text.setText(String.valueOf(valueDice));
        }
    }

}
