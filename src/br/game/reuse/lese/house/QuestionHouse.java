/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleHousePresenter;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleQuestionPresenter;
import br.game.reuse.lese.presenters.interfaces.HousePresenter;
import br.game.reuse.lese.presenters.interfaces.QuestionPresenter;
import br.game.reuse.lese.question.QuestionBoard;

/**
 *
 * @author cass
 */
public class QuestionHouse extends House {

    private QuestionBoard question;
    private boolean correct;

    public QuestionHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, QuestionBoard q, int cycle) {
        super(id, outcome, phase, cycle);
        this.question = q;
        this.correct = false;
    }

    public void setQuestion(QuestionBoard q) {
        this.question = q;
    }

    public QuestionBoard getQuestion() {
        return this.question;
    }

    @Override
    protected void presentContent() {

    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        QuestionPresenter questionPresenter = new ConsoleQuestionPresenter();
        questionPresenter.showQuestion(this.question);
        questionPresenter.showChoices(this.question);
        String answer = questionPresenter.getPlayerAnswer(this.question);
        this.correct = this.question.verifyAnswer(answer);
    }

    @Override
    protected void applyOutcome(PlayerBoard p) {
        HouseOutcome outcome = getOutcome();
        outcome.apply(p, this);
        HousePresenter housePresenter = new ConsoleHousePresenter();
        housePresenter.showHouseInfo(p);
        this.correct = false;
    }

    public boolean isCorrect() {
        return this.correct;
    }
}
