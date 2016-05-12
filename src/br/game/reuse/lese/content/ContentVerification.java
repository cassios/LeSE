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
public class ContentVerification extends ContentTemplate{
    private static ContentVerification instance;
    private List<Question> questionVerification;
    private List<Joker> jokerVerification;
    private final Phase phase;

    private ContentVerification() {
        this.phase = new PhaseDAO().selectPhasePerName(DevelopmentPhase.Verification.toString());
        this.questionVerification = new QuestionDAO().selectQuestionPerPhase(phase);
    }

    public static ContentVerification getInstance() {
        if (instance == null) {
            instance = new ContentVerification();
        }
        return instance;
    }

    @Override
    public Question draftQuestion() {
        if (this.questionVerification.isEmpty()) {
            completeListQuestions();
        }
        int indexQuestion = getRandomNumber(this.questionVerification.size());
        Question question = this.questionVerification.get(indexQuestion);
        this.questionVerification.remove(indexQuestion);
        return question;
    }

    @Override
    public Joker draftJoker() {
        if (this.jokerVerification.isEmpty()) {
            completeListJokers();
        }
        int indexJoker = getRandomNumber(this.jokerVerification.size());
        Joker joker = this.jokerVerification.get(indexJoker);
        this.jokerVerification.remove(indexJoker);
        return joker;
    }

    private int getRandomNumber(int limit) {
        return (int) (limit * Math.random());
    }

    private void completeListQuestions() {
        this.questionVerification = new QuestionDAO().selectQuestionPerPhase(this.phase);
    }

    private void completeListJokers() {
        this.jokerVerification = new JokerDAO().selectJokersPerPhase(this.phase);
    }
}
