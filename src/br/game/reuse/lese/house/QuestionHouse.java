/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.Board;
import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.content.ContentConstruction;
import br.game.reuse.lese.content.ContentElaboration;
import br.game.reuse.lese.content.ContentInception;
import br.game.reuse.lese.content.ContentTemplate;
import br.game.reuse.lese.content.ContentTransition;
import br.game.reuse.lese.content.ContentVerification;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleHousePresenter;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleQuestionPresenter;
import br.game.reuse.lese.presenters.interfaces.HousePresenter;
import br.game.reuse.lese.presenters.interfaces.QuestionPresenter;
import br.game.reuse.lese.question.QuestionBoard;
import java.util.List;

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
        ContentTemplate contentTemplate = null;
        switch(getDevPhase()){
            case Inception:
                contentTemplate = ContentInception.getInstance();
                break;
            case Elaboration:
                contentTemplate = ContentElaboration.getInstance();
                break;
            case Construction:
                contentTemplate = ContentConstruction.getInstance();
                break;
            case Verification:
                contentTemplate = ContentVerification.getInstance();
                break;
            case Transition:
                contentTemplate = ContentTransition.getInstance();
                break;
        }
        House houseUpdated = contentTemplate.refreshQuestion(this);
        updateContent(houseUpdated);
    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        QuestionPresenter questionPresenter = new ConsoleQuestionPresenter();
        questionPresenter.showQuestion(this.question);
        List<String> choices = questionPresenter.showChoices(this.question);
        String answer = questionPresenter.getPlayerAnswer(choices);
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
    
    public void updateContent(House house){
        QuestionHouse q = (QuestionHouse)house;
        setOutcome(q.getOutcome());
        setQuestion(q.getQuestion());
    }
}
