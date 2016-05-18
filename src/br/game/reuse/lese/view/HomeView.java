/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author bruno
 */
public class HomeView extends JFrame implements ActionListener{
    
    public HomeView(){
        super("LeSE - Learning Software Engineering");
        createMenu();
        createContent();
    }
    
    private void createMenu(){
        JMenu menuGame = new JMenu("Jogo");
        JMenuItem menuItemRanking = new JMenuItem("Ranking");
        menuItemRanking.addActionListener(this);
        menuGame.add(menuItemRanking);
        
        JMenuItem menuItemHelp = new JMenuItem("Ajuda");
        menuItemHelp.addActionListener(this);
        menuGame.add(menuItemHelp);
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(menuGame);
    }
    
    private void createContent(){
        setLayout(new BorderLayout());
        
        JPanel panelTitle = new JPanel();
        panelTitle.setLayout(new FlowLayout());
        JLabel title = new JLabel("LeSE");
        title.setFont(new Font("Verdana", Font.PLAIN, 16));
        panelTitle.add(title);
        
        ImageIcon imagePanel = new ImageIcon(getClass().getResource("../images/painel.jpeg"));
        JLabel labelImagemPainel = new JLabel(imagePanel);
        JPanel panelImage = new JPanel();
        panelImage.setLayout(new FlowLayout());
        panelImage.add(labelImagemPainel);
        panelImage.setBackground(Color.white);
        
        JPanel panelFooter = new JPanel();
        panelTitle.setLayout(new FlowLayout());
        JLabel footer = new JLabel(" ");
        panelFooter.add(footer);
        
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new FlowLayout());
        
        JLabel nameLabel = new JLabel("Nome: ");
        nameLabel.setLayout(null);
        nameLabel.setBounds(100, 100, 100, 100);
        JTextField nameField = new JTextField(10);
        nameField.setLayout(null);
        nameLabel.setBounds(150, 150, 150, 150);
        panelButtons.add(nameLabel);
        panelButtons.add(nameField);
        
        
        JButton play = new JButton("Iniciar Jogo", new ImageIcon(getClass().getResource("../images/jogar.gif")));
        play.setRolloverIcon(new ImageIcon(getClass().getResource("../images/jogarRoll.gif")));
        play.setFont(new Font("Verdana", Font.PLAIN, 16));
        play.addActionListener(this);
        play.setHorizontalAlignment(SwingConstants.LEFT);
        
        JButton sair = new JButton("Sair", new ImageIcon(getClass().getResource("../images/sair.gif")));
        sair.setRolloverIcon(new ImageIcon(getClass().getResource("../images/sairRoll.gif")));
        sair.setFont(new Font("Verdana", Font.PLAIN, 16));
        sair.addActionListener(this);
        sair.setHorizontalAlignment(SwingConstants.LEFT);
        
//        panelButtons.add(play);
//        panelButtons.add(sair);
        
        add(panelTitle, BorderLayout.NORTH);
        add(panelButtons, BorderLayout.CENTER);
        add(panelImage, BorderLayout.WEST);
//        add(panelButtons, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Ranking")){
            System.out.print("Ranking");
        }else if(ae.getActionCommand().equals("Ajuda")){
            System.out.print("Ajuda");
        }
    }
}
