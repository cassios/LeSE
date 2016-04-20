/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.view.interfaces.AbstractComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author bruno
 */
public class StartGameView extends JFrame implements ActionListener{

    private Container container;
    private JButton buttonExit, buttonPlay;
    private JPanel panelButtons, panelDataSet, panelHeader;
    private JPanel panelCenter, panelFooter, panelImage;
    private JLabel nameStudent;
    private GridLayout gridButtons, gridDataSet, gridHeader, gridFooter;
    private JTextField fieldNameStudent;
    private JMenu menuBar;
    private JMenuBar menuBoard;
    private JMenuItem help, ranking;
    
    private static final String PATH_IMAGES = "../images/";

    String nomeObjJogador;

    public StartGameView() {
        super("Learning Engineering Software - LeSE");
        createComponentsWindow();
    }

    public void createComponentsWindow() {

        createGrids();
        createPanelImage();     
        createPanelButton();
        createHeader();
        createCenter();
        createMenu();
        createFooter();
        manageContainer();

    }

    public void createMenu() {
        menuBar = new JMenu("Jogo");
        menuBar.setBackground(Color.lightGray);
        ranking = new JMenuItem("Ranking");
        ranking.addActionListener(this);
        help = new JMenuItem("Ajuda");
        help.addActionListener(this);
        menuBar.add(ranking);
        menuBar.add(help);
        menuBoard = new JMenuBar();
        setJMenuBar(menuBoard);
//        menuBoard.setBackground(Color.lightGray);
        menuBoard.add(menuBar);
    }

    public void createFooter() {
        // configuração do painel de rodapé
        panelFooter = new JPanel();
        panelFooter.setLayout(gridFooter);
        panelFooter.setBackground(Color.white);
        panelFooter.add(new JLabel(""));
    }

    public void createCenter() {

        // label do nome do jogador
        nameStudent = new JLabel("Informe seu nome:");
        nameStudent.setHorizontalAlignment(SwingConstants.LEFT);

        // campo do nome do jogador
        fieldNameStudent = new JTextField(15);
        fieldNameStudent.setHorizontalAlignment(SwingConstants.LEFT);

        // configuração do painel central
        panelCenter = new JPanel();
        panelCenter.setLayout(gridDataSet);
        panelCenter.setBackground(Color.lightGray);
        panelCenter.add(nameStudent);
        panelCenter.add(fieldNameStudent);
    }

    public void createHeader() {

        //cabeçalho
        JLabel text = new JLabel("Bem Vindo ao Jogo");
        text.setHorizontalAlignment(SwingConstants.CENTER);

        // painel de cabeçalho
        panelHeader = new JPanel();
        panelHeader.setLayout(gridHeader);
        panelHeader.setBackground(Color.lightGray);
        panelHeader.add(text);
    }

    public void createPanelButton() {

        ImageIcon imagePlay = new ImageIcon(getClass().getResource(PATH_IMAGES + "jogar.gif"));
        ImageIcon imagePlayRoll = new ImageIcon(getClass().getResource(PATH_IMAGES + "jogarRoll.gif")); // imagem Rollover
        
        // botão Iniciar Jogo
        buttonPlay = new JButton("Iniciar Jogo", imagePlay);
        buttonPlay.setRolloverIcon(imagePlayRoll);
        buttonPlay.addActionListener(this);
        buttonPlay.setSize(250, 15);
        buttonPlay.setHorizontalAlignment(SwingConstants.LEFT);
        
        ImageIcon imageExit = new ImageIcon(getClass().getResource(PATH_IMAGES + "sair.gif"));
        ImageIcon imageExitRoll = new ImageIcon(getClass().getResource(PATH_IMAGES + "sairRoll.gif")); // imagem Rollover   

        // botão Sair
        buttonExit = new JButton("Abandonar o Jogo", imageExit);
        buttonExit.setRolloverIcon(imageExitRoll);
        buttonExit.addActionListener(this);
        buttonExit.setSize(250, 15);
        buttonExit.setHorizontalAlignment(SwingConstants.RIGHT);
        buttonExit.setHorizontalTextPosition(SwingConstants.LEFT);

        // painel de botões (inferior)
        panelButtons = new JPanel();
        panelButtons.setBackground(Color.lightGray);
        panelButtons.setLayout(gridButtons);
        panelButtons.add(buttonExit);
        panelButtons.add(buttonPlay);
    }

    public void createPanelImage() {

        // painel da imagem (esquerda)
        ImageIcon imagePanel = new ImageIcon(getClass().getResource(PATH_IMAGES + "painel.jpeg"));
        JLabel labelImagemPainel = new JLabel(imagePanel);
        panelImage = new JPanel();
        panelImage.add(labelImagemPainel);
        panelImage.setBackground(Color.white);
    }
    
    public void createGrids(){
        // gerenciadores de layout
        gridButtons = new GridLayout(1, 2, 5, 5);
        gridDataSet = new GridLayout(6, 1, 10, 10);
        gridHeader = new GridLayout(1, 1, 10, 10);
        gridFooter = new GridLayout(1, 1, 10, 10);
    }
    
    public void manageContainer(){
        // configuração do painel de dados (que possui o painel de cabeçalho,
        // o painel central e o painel de botões
        panelDataSet = new JPanel();
        panelDataSet.setLayout(new BorderLayout(10, 10));
        panelDataSet.setBackground(Color.lightGray);
        panelDataSet.add(panelHeader, BorderLayout.NORTH);
        panelDataSet.add(panelCenter);
        panelDataSet.add(panelButtons, BorderLayout.SOUTH);

        // configuração do container (que tem toda essa bagunça aí!!! =)
        container = getContentPane();
        container.setLayout(new BorderLayout(5, 5));
        container.setBackground(Color.lightGray);
        container.add(panelFooter, BorderLayout.SOUTH);
        container.add(panelImage, BorderLayout.WEST);
        container.add(panelDataSet);
        
        setSize(800, 500);
        setVisible(true);
        setResizable(false);
    }
    
    private void exitGame(){
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == buttonExit){
            exitGame();
        }else if(event.getSource() == buttonPlay){
            System.out.println("Play");
        }else if(event.getSource() == help){
//            System.out.println("Help");
            AbstractComponent component = new ComponentHouseView();
            component.addComponent(component);
        }else if(event.getSource() == ranking){
//            System.out.println("Ranking");
            AbstractComponent component = new ComponentScoreboardView();
            component.addComponent(component);
        }
    }

}
