/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.Player;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.question.Question;

/**
 *
 * @author cass
 */
public class QuestionHouse extends House {
    private Question question;
    
    QuestionHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, Question q) {
        super(id, outcome, phase);
        this.question = q;
    }
    
    public void setQuestion(Question q) {
        this.question = q;
    }
    
    public Question getQuestion() {
        return this.question;
    }

    @Override
    protected void presentContent() {
        System.out.println(this.question.getDescription());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void interactWithPlayer(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void applyOutcome(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
