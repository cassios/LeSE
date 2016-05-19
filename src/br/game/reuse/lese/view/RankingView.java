/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.model.Player;
import br.game.reuse.lese.model.dao.PlayerDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.CellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author bruno
 */
public class RankingView extends JFrame implements ActionListener {

    private JPanel panelData;

    public RankingView() {
        super("LeSE - Learning Software Engineering");
        createComponents();
    }

    private void createComponents() {
        this.panelData = new JPanel();
        this.panelData.setLayout(new BorderLayout(10, 10));
        this.panelData.setBackground(Color.lightGray);
        createMenu();
        createHeader();
        createButtons();
        createCenter();
        createFooter();
        getContentPane().add(this.panelData);
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

        JButton voltar = new JButton("Voltar", new ImageIcon(getClass().getResource("../images/sair.gif")));
        voltar.setRolloverIcon(new ImageIcon(getClass().getResource("../images/sairRoll.gif")));
        voltar.setSize(250, 15);
        voltar.addActionListener(this);

        panelButtons.setBackground(Color.lightGray);
        panelButtons.setLayout(new GridLayout(1, 2, 5, 5));
        panelButtons.add(voltar);

        panelData.add(panelButtons, BorderLayout.SOUTH);
    }

    private void createFooter() {
        JPanel panelFooter = new JPanel();
        panelFooter.setLayout(new GridLayout(1, 1, 10, 10));
        panelFooter.setBackground(Color.lightGray);
        panelFooter.add(new JLabel(" "));
        getContentPane().add(panelFooter, BorderLayout.SOUTH);
    }

    private void createCenter() {
        String[] colunas = new String[]{"Posição", "Nome do Jogador", "Pontuação"};
        String[][] dados = getData();
        JTable rankingTable = null;
        JScrollPane scroll = new JScrollPane();
        if (dados != null) {
            rankingTable = new JTable(dados, colunas);
            DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
            cellRender.setHorizontalAlignment(SwingConstants.CENTER);
            rankingTable.getColumn(colunas[0]).setMaxWidth(100);
            rankingTable.getColumn(colunas[0]).setCellRenderer(cellRender);
            rankingTable.getColumn(colunas[2]).setMaxWidth(200);
            rankingTable.getColumn(colunas[2]).setCellRenderer(cellRender);
            rankingTable.getTableHeader().setReorderingAllowed(false);
            rankingTable.setEnabled(false);
            scroll.setViewportView(rankingTable);
        } else {
            JLabel emptyLabel = new JLabel("Ranking de Jogadores vazio!!!");
            emptyLabel.setHorizontalAlignment(SwingConstants.CENTER);
            scroll.setViewportView(emptyLabel);
        }
        this.panelData.add(scroll);
    }

    private void createHeader() {

        JLabel text = new JLabel("Ranking dos Jogadores");
        text.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(new GridLayout(1, 1, 10, 10));
        panelHeader.setBackground(Color.lightGray);
        panelHeader.add(text);
        this.panelData.add(panelHeader, BorderLayout.NORTH);
    }

    private String[][] getData() {
        List<Player> listPlayers = new PlayerDAO().ranking();
        if (!listPlayers.isEmpty()) {
            String[][] ranking = new String[listPlayers.size()][2];
            int index = 0;
            for (Player p : listPlayers) {
                ranking[index] = new String[]{String.valueOf(index+1)+"º", p.getName(), String.valueOf(p.getScore())};
                index++;
            }
            return ranking;
        }
        return null;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Voltar")) {
            HomeView home = new HomeView();
            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            home.setSize(800, 500);
            home.setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("Ajuda")) {
            JOptionPane.showMessageDialog(null, "Texto de Ajuda sobre o Jogo", "Ajuda", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getActionCommand().equals("Iniciar Jogo")) {
//            System.out.println(nameField.getText());
        }
    }
}
