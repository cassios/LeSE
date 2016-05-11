/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;
import java.util.Scanner;

/**
 *
 * @author cass
 */
public class BoardGame {
    private Board board;
    
    
    public void creatBoard(BoardBuilder builder) {
        
        builder.buildBoard();
        builder.buildProject();
        builder.buildHouses();
    }
    
    public void setUpGame() {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many players?:");
        int nPlayers = sc.nextInt();
        
        for (int i = 1; i <= nPlayers; i++) {
            System.out.println("Enter player " + i + " nickname." );
            String playerName = sc.next();
            this.board.addPlayer(playerName, "red");
        }
    }
    
    public void init(){
        creatBoard(new BoardBuilder());
        this.board = Board.getInstance();
        setUpGame();
        run();
    }
    
    public void run() {
        PlayerBoard winner = null;
        
        while(winner == null) {
            for (PlayerBoard p : this.board.getPlayers()) {
               House playerHouse = this.board.getPlayerHouse(p);
               playerHouse.execute(p);
               
               if(this.board.hasWinner()) {
                   winner = this.board.getWinner();
                   break;
               }
            }
        }
        
        if(winner != null) {
            System.out.println("Player " + winner.getNickname() + " won!!!");
        }
    }    
}
