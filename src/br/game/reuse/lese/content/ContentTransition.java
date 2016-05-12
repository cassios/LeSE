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
public class ContentTransition extends ContentTemplate{
    private static ContentTransition instance;
    private List<Question> questionTransition;
    private List<Joker> jokerTransition;
    private final Phase phase;

    private ContentTransition() {
        this.phase = new PhaseDAO().selectPhasePerName(DevelopmentPhase.Transition.toString());
        this.questionTransition = new QuestionDAO().selectQuestionPerPhase(phase);
    }

    public static ContentTransition getInstance() {
        if (instance == null) {
            instance = new ContentTransition();
        }
        return instance;
    }

    @Override
    public Question draftQuestion() {
        if (this.questionTransition.isEmpty()) {
            completeListQuestions();
        }
        int indexQuestion = getRandomNumber(this.questionTransition.size());
        Question question = this.questionTransition.get(indexQuestion);
        this.questionTransition.remove(indexQuestion);
        return question;
    }

    @Override
    public Joker draftJoker() {
        if (this.jokerTransition.isEmpty()) {
            completeListJokers();
        }
        int indexJoker = getRandomNumber(this.jokerTransition.size());
        Joker joker = this.jokerTransition.get(indexJoker);
        this.jokerTransition.remove(indexJoker);
        return joker;
    }

    private int getRandomNumber(int limit) {
        return (int) (limit * Math.random());
    }

    private void completeListQuestions() {
        this.questionTransition = new QuestionDAO().selectQuestionPerPhase(this.phase);
    }

    private void completeListJokers() {
        this.jokerTransition = new JokerDAO().selectJokersPerPhase(this.phase);
    }
}
