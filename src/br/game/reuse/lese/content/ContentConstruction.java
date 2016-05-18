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
public class ContentConstruction extends ContentTemplate{
    private static ContentConstruction instance;
    private List<Question> questionConstruction;
    private List<Joker> jokerConstruction;
    private final Phase phase;

    private ContentConstruction() {
        this.phase = new PhaseDAO().selectPhasePerName(DevelopmentPhase.Construction.toString());
        completeListQuestions();
        completeListJokers();
    }

    public static ContentConstruction getInstance() {
        if (instance == null) {
            instance = new ContentConstruction();
        }
        return instance;
    }

    @Override
    public Question draftQuestion() {
        if (this.questionConstruction.isEmpty()) {
            completeListQuestions();
        }
        int indexQuestion = getRandomNumber(this.questionConstruction.size());
        Question question = this.questionConstruction.get(indexQuestion);
        this.questionConstruction.remove(indexQuestion);
        return question;
    }

    @Override
    public Joker draftJoker() {
        if (this.jokerConstruction.isEmpty()) {
            completeListJokers();
        }
        int indexJoker = getRandomNumber(this.jokerConstruction.size());
        Joker joker = this.jokerConstruction.get(indexJoker);
        this.jokerConstruction.remove(indexJoker);
        return joker;
    }

    private int getRandomNumber(int limit) {
        return (int) (limit * Math.random());
    }

    private void completeListQuestions() {
        this.questionConstruction = new QuestionDAO().selectQuestionPerPhase(this.phase);
    }

    private void completeListJokers() {
        this.jokerConstruction = new JokerDAO().selectJokersPerPhase(this.phase);
    }
}
