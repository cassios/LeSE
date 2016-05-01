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
import outcome.QuestionOutcome;
import question.MultipleChoiceQuestion;

/**
 *
 * @author cass
 */
public class BoardGame {
    private Board board;
    
    
    public creatBoard(int numberOfHouses) {
        this.board = new Board();
        
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
    }
    
}
