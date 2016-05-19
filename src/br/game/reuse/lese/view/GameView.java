/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author bruno
 */
public class GameView extends JFrame implements ActionListener {

    private JPanel panelDataSet;
    private BufferedImage backBuffer;
    private int code = 0;
    private Color[] colors;
    private static final int housePerPhase = 6;
    private Graphics g;

    public GameView() {
        super("LeSE - Learning Software Engineering");
        this.colors = new Color[]{
            new Color(250, 128, 114),
            new Color(147, 112, 219),
            new Color(144, 238, 144),
            new Color(255, 236, 139),
            new Color(187, 255, 255)
        };
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setVisible(true);
        createComponents();
    }

    private void createComponents() {
        this.panelDataSet = new JPanel();
        this.panelDataSet.setLayout(new BorderLayout(10, 10));
        this.panelDataSet.setBackground(Color.lightGray);
        createMenu();
        createHeader();
//        createPanelImage();
//        createButtons();
        createCenter();
        createFooter();        
        getContentPane().add(panelDataSet);
    }

    private void createMenu() {
        JMenu menuGame = new JMenu("Jogo");
        JMenuItem menuItemRanking = new JMenuItem("Ajuda");
        menuItemRanking.addActionListener(this);
        menuGame.add(menuItemRanking);

        JMenuItem menuItemHelp = new JMenuItem("Sair");
        menuItemHelp.addActionListener(this);
        menuGame.add(menuItemHelp);

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(menuGame);
    }

//    private void createButtons() {
//
//        JPanel panelButtons = new JPanel();
//
//        JButton play = new JButton("Iniciar Jogo", new ImageIcon(getClass().getResource("../images/jogar.gif")));
//        play.setRolloverIcon(new ImageIcon(getClass().getResource("../images/jogarRoll.gif")));
//        play.setSize(250, 15);
//        play.addActionListener(this);
//        play.setHorizontalAlignment(SwingConstants.LEFT);
//
//        JButton sair = new JButton("Sair", new ImageIcon(getClass().getResource("../images/sair.gif")));
//        sair.setRolloverIcon(new ImageIcon(getClass().getResource("../images/sairRoll.gif")));
//        sair.setSize(250, 15);
//        sair.addActionListener(this);
//        sair.setHorizontalAlignment(SwingConstants.LEFT);
//
//        panelButtons.setBackground(Color.lightGray);
//        panelButtons.setLayout(new GridLayout(1, 2, 5, 5));
//        panelButtons.add(sair);
//        panelButtons.add(play);
//
//        panelDataSet.add(panelButtons, BorderLayout.SOUTH);
//    }
    private void createFooter() {
        JPanel panelFooter = new JPanel();
        panelFooter.setLayout(new GridLayout(1, 1, 10, 10));
        panelFooter.setBackground(Color.lightGray);
        panelFooter.add(new JLabel(" "));
        getContentPane().add(panelFooter, BorderLayout.SOUTH);
    }

    private void createCenter() {
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridBagLayout());
        panelCenter.setBackground(Color.lightGray);
        createBotton(panelCenter);
        createLeft(panelCenter);
        createTop(panelCenter);
        createRight(panelCenter);
        drawWalker(panelCenter);
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

    private void createTop(JPanel panelCenter) {
        int y = 1;
        for (int x = 1; x < 9; x++) {
            int index = ((this.code - 1) / (housePerPhase));
            Color color = colors[index];
            if (this.code % 3 == 0) {
                createJoker(panelCenter, x, y, this.code, 1, 1, 1, 0, color);
            } else {
                createQuestion(panelCenter, x, y, this.code, 1, 1, 1, 0, color);
            }
            this.code++;
        }
    }

    private void createLeft(JPanel panelCenter) {
        int x = 1;
        for (int y = 9; y > 1; y--) {
            int index = ((this.code - 1) / (housePerPhase));
            Color color = colors[index];
            if (this.code % 3 == 0) {
                createJoker(panelCenter, x, y, this.code, 0, 1, 1, 1, color);
            } else {
                createQuestion(panelCenter, x, y, this.code, 0, 1, 1, 1, color);
            }
            this.code++;
        }
    }

    private void createBotton(JPanel panelCenter) {
        int y = 9;
        for (int x = 9; x > 1; x--) {
            if (x == 9) {
                createStart(panelCenter, x, y, this.code, 1, 0, 1, 1);
            } else if (this.code % 3 == 0) {
                int index = ((this.code - 1) / (housePerPhase));
                Color color = colors[index];
                createJoker(panelCenter, x, y, this.code, 1, 0, 1, 1, color);
            } else {
                int index = ((this.code - 1) / (housePerPhase));
                Color color = colors[index];
                createQuestion(panelCenter, x, y, this.code, 1, 0, 1, 1, color);
            }
            this.code++;
        }
    }

    private void createRight(JPanel panelCenter) {
        int x = 9;
        for (int y = 1; y < 9; y++) {
            if (y == 8) {
                createEnd(panelCenter, x, y, this.code, 1, 1, 0, 1);
            } else if (this.code % 3 == 0) {
                int index = ((this.code - 1) / (housePerPhase));
                Color color = colors[index];
                createJoker(panelCenter, x, y, this.code, 1, 1, 0, 1, color);
            } else {
                int index = ((this.code - 1) / (housePerPhase));
                Color color = colors[index];
                createQuestion(panelCenter, x, y, this.code, 1, 1, 0, 1, color);
            }
            this.code++;
        }
    }

    private void createStart(JPanel panelCenter, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight) {
        ImageIcon imageStart = new ImageIcon(getClass().getResource("../images/start.png"));
        JLabel label = new JLabel(imageStart);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(Color.lightGray);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        panelCenter.add(label, c);
    }

    private void createEnd(JPanel panelCenter, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight) {
        ImageIcon imageStart = new ImageIcon(getClass().getResource("../images/finish.png"));
        JLabel label = new JLabel(imageStart);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(Color.lightGray);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        panelCenter.add(label, c);
    }

    private void createQuestion(JPanel panelCenter, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight, Color color) {
        ImageIcon imageQuestion = new ImageIcon(getClass().getResource("../images/question.png"));
        JLabel label = new JLabel(imageQuestion);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(color);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        panelCenter.add(label, c);
    }

    public void createJoker(JPanel panelCenter, int positionX, int positionY, int code, int borderTop, int borderLeft, int borderBotton, int BorderRight, Color color) {
        ImageIcon imageJoker = new ImageIcon(getClass().getResource("../images/joker.png"));
        JLabel label = new JLabel(imageJoker);
        label.setName("house" + code);
        label.setOpaque(true);
        label.setBackground(color);
        Border border = BorderFactory.createMatteBorder(borderTop, borderLeft, borderBotton, BorderRight, Color.BLACK);
        label.setBorder(border);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = positionX;
        c.gridy = positionY;
        panelCenter.add(label, c);
    }

    public void drawWalker(JPanel panelCenter) {
        ImageIcon walker = new ImageIcon(getClass().getResource("../images/walker.png"));
        JLabel label = new JLabel(walker);
        label.setName("house" + 0);
        label.setOpaque(true);
        Border border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK);
        label.setBorder(border);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 9;
        c.gridy = 9;
        panelCenter.add(label, c);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Ranking")) {

        } else if (ae.getActionCommand().equals("Ajuda")) {
            JOptionPane.showMessageDialog(null, "Texto de Ajuda sobre o Jogo", "Ajuda", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getActionCommand().equals("Iniciar Jogo")) {

        } else if (ae.getActionCommand().equals("Sair")) {
            String message = "Se você sair do jogo sem finalizá-lo toda sua pontução será perdida. Deseja realmente sair do jogo?";
            String title = "Sair";
            int confirm = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
