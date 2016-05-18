/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.content;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.model.Joker;
import br.game.reuse.lese.model.Phase;
import br.game.reuse.lese.model.Question;
import br.game.reuse.lese.model.dao.JokerDAO;
import br.game.reuse.lese.model.dao.PhaseDAO;
import br.game.reuse.lese.model.dao.QuestionDAO;
import java.util.List;

/**
 *
 * @author bruno
 */
public class ContentInception extends ContentTemplate{
    private static ContentInception instance;
    private List<Question> questionInception;
    private List<Joker> jokerInception;
    private final Phase phase;
    
    private ContentInception(){
        this.phase = new PhaseDAO().selectPhasePerName(DevelopmentPhase.Inception.toString());
        completeListQuestions();
        completeListJokers();
    }
    
    public static ContentInception getInstance(){
        if(instance == null){
            instance = new ContentInception();
        }
        return instance;
    }
    
    @Override
    public Question draftQuestion() {
        if(this.questionInception.isEmpty()){
            completeListQuestions();
        }
        int indexQuestion = getRandomNumber(this.questionInception.size());
        Question question = this.questionInception.get(indexQuestion);
        this.questionInception.remove(indexQuestion);
        return question;
    }
    
    @Override
    public Joker draftJoker() {
        if(this.jokerInception.isEmpty()){
            completeListJokers();
        }
        int indexJoker = getRandomNumber(this.jokerInception.size());
        Joker joker = this.jokerInception.get(indexJoker);
        this.jokerInception.remove(indexJoker);
        return joker;
    }
    
    private int getRandomNumber(int limit){
        return (int)(limit*Math.random());
    }
    
    private void completeListQuestions(){
        this.questionInception = new QuestionDAO().selectQuestionPerPhase(this.phase);
    }
    
    private void completeListJokers(){
        this.jokerInception = new JokerDAO().selectJokersPerPhase(this.phase);
    }
    
}
