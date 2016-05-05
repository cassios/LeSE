/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.main;

import br.game.reuse.lese.board.BoardBuilder;

/**
 *
 * @author bruno
 */
public class Lese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BoardBuilder boarderBuilder = new BoardBuilder();
        boarderBuilder.buildBoard();
        
//        StartGameView gameLese = new StartGameView();
//        gameLese.setVisible(true);
        
    }
    
}
