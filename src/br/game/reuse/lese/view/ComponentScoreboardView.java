/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.view.interfaces.AbstractComponent;
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
public class ComponentScoreboardView extends AbstractComponent {

    private JTextField text;
    private JButton button;
    private int score = 0;
    
    public ComponentScoreboardView() {
        super();
    }

    @Override
    public void addComponent(AbstractComponent component) {

//        component.container = getContentPane();
//        component.container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
//        JPanel jpanel = new JPanel();
        ImageIcon imageStart = new ImageIcon(getClass().getResource("../images/start.png"));
        JLabel label = new JLabel("Pontuação: ");
        text = new JTextField(15);
        label.setFont(new java.awt.Font("Dialog", 1, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setName("pontuacao");
        text.setFont(new java.awt.Font("Dialog", 1, 24));
        text.setText(String.valueOf(component.score));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setEnabled(false);
//        text.setText("Bruno");
//        Border border = BorderFactory.createMatteBorder(1, 1, 1, 0, Color.BLACK);
//        Border border2 = BorderFactory.createMatteBorder(1, 0, 1, 1, Color.BLACK);
//        label.setBorder(border);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridwidth = 2;
        c.gridy = 2;
//        jpanel.add(label, c);
        component.container.add(label, c);
//        text.setBorder(border2);
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 8;
        c.gridwidth = 1;
        c.gridy = 2;
        component.container.add(text, c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //not used.
//        if(ae.getSource() == button){
//            text.setText("Funcionou");
//        }
    }
    
    public void addComponent(AbstractComponent component, int additionalScore) {
        this.score = this.score + additionalScore;
        addComponent(component);
    }
}
