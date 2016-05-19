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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author bruno
 */
public class HomeView extends JFrame implements ActionListener {

    private JPanel panelDataSet;
    private JTextField nameField;

    public HomeView() {
        super("LeSE - Learning Software Engineering");
        createComponents();
    }

    private void createComponents() {
        this.panelDataSet = new JPanel();
        this.panelDataSet.setLayout(new BorderLayout(10, 10));
        this.panelDataSet.setBackground(Color.lightGray);
        createMenu();
        createHeader();
        createPanelImage();
        createButtons();
        createCenter();
        createFooter();
        getContentPane().add(panelDataSet);
    }

    private void createMenu() {
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

    private void createButtons() {

        JPanel panelButtons = new JPanel();

        JButton play = new JButton("Iniciar Jogo", new ImageIcon(getClass().getResource("../images/jogar.gif")));
        play.setRolloverIcon(new ImageIcon(getClass().getResource("../images/jogarRoll.gif")));
        play.setSize(250, 15);
        play.addActionListener(this);
        play.setHorizontalAlignment(SwingConstants.LEFT);

        JButton sair = new JButton("Sair", new ImageIcon(getClass().getResource("../images/sair.gif")));
        sair.setRolloverIcon(new ImageIcon(getClass().getResource("../images/sairRoll.gif")));
        sair.setSize(250, 15);
        sair.addActionListener(this);
        sair.setHorizontalAlignment(SwingConstants.LEFT);

        panelButtons.setBackground(Color.lightGray);
        panelButtons.setLayout(new GridLayout(1, 2, 5, 5));
        panelButtons.add(sair);
        panelButtons.add(play);

        panelDataSet.add(panelButtons, BorderLayout.SOUTH);
    }

    private void createFooter() {
        JPanel panelFooter = new JPanel();
        panelFooter.setLayout(new GridLayout(1, 1, 10, 10));
        panelFooter.setBackground(Color.lightGray);
        panelFooter.add(new JLabel(" "));
        getContentPane().add(panelFooter, BorderLayout.SOUTH);
    }

    private void createCenter() {
        JLabel nameLabel = new JLabel("Informe seu nome:");
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);

        this.nameField = new JTextField(15);
        nameField.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(6, 1, 10, 10));
        panelCenter.setBackground(Color.lightGray);
        panelCenter.add(nameLabel);
        panelCenter.add(nameField);
        panelDataSet.add(panelCenter);
    }

    private void createHeader() {

        JLabel text = new JLabel("Bem Vindo ao Jogo");
        text.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(new GridLayout(1, 1, 10, 10));
        panelHeader.setBackground(Color.lightGray);
        panelHeader.add(text);
        panelDataSet.add(panelHeader, BorderLayout.NORTH);
    }

    private void createPanelImage() {

        ImageIcon imagePanel = new ImageIcon(getClass().getResource("../images/painel.jpeg"));
        JLabel labelImagemPainel = new JLabel(imagePanel);
        JPanel panelImage = new JPanel();
        panelImage.add(labelImagemPainel);
        panelImage.setBackground(Color.white);
        getContentPane().add(panelImage, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Ranking")) {
            RankingView ranking = new RankingView();
            ranking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ranking.setSize(800, 500);
            ranking.setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("Ajuda")) {
            JOptionPane.showMessageDialog(null, "Texto de Ajuda sobre o Jogo", "Ajuda", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getActionCommand().equals("Iniciar Jogo")) {
            System.out.println(nameField.getText());
        } else if (ae.getActionCommand().equals("Sair")) {
            System.exit(0);
        }
    }
}
