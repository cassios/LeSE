/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.content;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.house.QuestionHouse;
import br.game.reuse.lese.model.Answer;
import br.game.reuse.lese.model.Joker;
import br.game.reuse.lese.model.Question;
import br.game.reuse.lese.outcome.BonusOutcome;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.outcome.PenalityOutcome;
import br.game.reuse.lese.question.JokerBoard;
import br.game.reuse.lese.question.QuestionBoard;

/**
 *
 * @author bruno
 */
public abstract class ContentTemplate {

    public abstract Question draftQuestion();

    public abstract Joker draftJoker();
    
    public House refreshQuestion(House house){
        Question q = draftQuestion();
        HouseOutcome outcome = new BonusOutcome(q.getHouse(), q.getScore(), (float) 0.0);
        QuestionBoard questionBoard = new QuestionBoard(q.getDescription(), q.getExplanation());
        for(Answer answer : q.getAnswer()){
            questionBoard.addChoice(answer.getDescription(), (answer.getStatus().equals("1")));
        }
        QuestionHouse questionUpdated = new QuestionHouse(house.getId(), outcome, house.getDevPhase(), questionBoard, house.getCycle());
        return questionUpdated;
    }
    
    public House refreshJoker(House house){
        Joker j = draftJoker();
        HouseOutcome outcome;
        if(j.getAction().equals("1")){
            outcome = new BonusOutcome(j.getHouse(), j.getScore(), (float) 0.0);
        }else{
            outcome = new PenalityOutcome(j.getHouse(), j.getScore());
        }
        JokerBoard jokerBoard = new JokerBoard(j.getTitle(), j.getDescription());
        JokerHouse jokerUpdated = new JokerHouse(house.getId(), outcome, house.getDevPhase(), jokerBoard, house.getCycle());
        return jokerUpdated;
    }

}
