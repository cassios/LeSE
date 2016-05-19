/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author bruno
 */
public class MainTeste {
    
    public static void main(String[] args){
        HomeView start = new HomeView();
//        RankingView start = new RankingView();
//        StartGameView start = new StartGameView();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setSize(800, 500);
//        start.getContentPane().setBackground(Color.yellow);
//        start.pack();
        start.setVisible(true);
    }
    
}
