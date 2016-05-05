/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.outcome.BonusOutcome;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.QuestionHouse;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.question.*;

/**
 *
 * @author cass
 */
public class BoardBuilder {
    private Board board;
    
    public void buildBoard() {
        this.board = Board.getInstance();
        buildHouses();
    }
    
    public void buildHouses() {
    
        int nHousesPerPhase = 6;
        for (DevelopmentPhase phase : DevelopmentPhase.values()) {
            for (int i = 1; i <= nHousesPerPhase; i++) {
                if (i % 2 != 0) {
                    Question q = new Question("desc", "explanation");
                    q.addChoice("42", true);
                    for (int j = 0; j < 3; j++) q.addChoice(Integer.toString(j), false);
                  
                    HouseOutcome outcome = new BonusOutcome(2, 5, (float) 1.0);
                    House questionHouse = new QuestionHouse(1, outcome, phase, q);
                    this.board.addHouse(questionHouse);
                } else {
                    HouseOutcome outcome = new BonusOutcome(2, 3, (float) 1.0);
                    House jokerHouse = new JokerHouse(1, outcome, phase, "desc"); 
                    this.board.addHouse(jokerHouse);
                }
            }
        }
    }
    
    
}
