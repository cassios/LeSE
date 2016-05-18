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
public class ContentElaboration extends ContentTemplate {
    private static ContentElaboration instance;
    private List<Question> questionElaboration;
    private List<Joker> jokerElaboration;
    private final Phase phase;

    private ContentElaboration() {
        this.phase = new PhaseDAO().selectPhasePerName(DevelopmentPhase.Elaboration.toString());
        completeListQuestions();
        completeListJokers();
    }

    public static ContentElaboration getInstance() {
        if (instance == null) {
            instance = new ContentElaboration();
        }
        return instance;
    }

    @Override
    public Question draftQuestion() {
        if (this.questionElaboration.isEmpty()) {
            completeListQuestions();
        }
        int indexQuestion = getRandomNumber(this.questionElaboration.size());
        Question question = this.questionElaboration.get(indexQuestion);
        this.questionElaboration.remove(indexQuestion);
        return question;
    }

    @Override
    public Joker draftJoker() {
        if (this.jokerElaboration.isEmpty()) {
            completeListJokers();
        }
        int indexJoker = getRandomNumber(this.jokerElaboration.size());
        Joker joker = this.jokerElaboration.get(indexJoker);
        this.jokerElaboration.remove(indexJoker);
        return joker;
    }

    private int getRandomNumber(int limit) {
        return (int) (limit * Math.random());
    }

    private void completeListQuestions() {
        this.questionElaboration = new QuestionDAO().selectQuestionPerPhase(this.phase);
    }

    private void completeListJokers() {
        this.jokerElaboration = new JokerDAO().selectJokersPerPhase(this.phase);
    }

}
