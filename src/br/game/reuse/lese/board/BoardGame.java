/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lesse.house.House;
import br.game.reuse.lesse.house.QuestionHouse;
import br.game.reuse.lesse.outcome.HouseOutcome;
import br.game.reuse.lese.question.Question;
import java.util.Scanner;

/**
 *
 * @author cass
 */
public class BoardGame {
    private Board board;
    
    
    public creatBoard(int numberOfHouses) {
    /*    
        for(int i=1; i<=numberOfHouses; i++) {
            if(i%2 != 0) {
                Question q = new MultipleChoiceQuestion("description" + 1, "no words");
                HouseOutcome outcome = new QuestionOutcome("Title"+1, "", 1, 2, 10);
                House qh = new QuestionHouse("Title"+1, i, q, outcome);
                this.board.addHouse(qh);
            } else {
                HouseOutcome outcome = new QuestionOutcome("Title"+1, "", 1, 2, 10);
                House qh = new QuestionHouse("Title"+1, i, q, outcome);
                this.board.addHouse(qh);
            }
        }
*/
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
    
    public void run() {
        Player winner = null;
        
        while(true) {
            for (Player p : this.board.getPlayers()) {
               House playerHouse = this.board.getPlayerHouse(p);
               playerHouse.execute(p);
               
               if(this.board.hasWinner()) {
                   winner = this.board.getWinner();
                   break;
               }
            }
        }
        System.out.println("Player " + winner.getNickname() + " won!!!");
    }
    
}
