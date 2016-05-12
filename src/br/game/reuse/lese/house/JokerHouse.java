/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

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
import br.game.reuse.lese.presenters.consolepresenters.ConsoleJokerHousePresenter;
import br.game.reuse.lese.presenters.interfaces.HousePresenter;
import br.game.reuse.lese.presenters.interfaces.MessagePresenter;
import br.game.reuse.lese.question.JokerBoard;

/**
 *
 * @author cass
 */
public class JokerHouse extends House {
    private JokerBoard joker;
    
    public JokerHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, JokerBoard j, int cycle) {
        super(id, outcome, phase, cycle);
        this.joker = j;
    }
    
    public JokerBoard getJoker() {
        return this.joker;
    }
    
    public void setJoker(JokerBoard j) {
        this.joker = j;
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
        House houseUpdated = contentTemplate.refreshJoker(this);
        updateContent(houseUpdated);
    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        MessagePresenter jokerPresenter = new ConsoleJokerHousePresenter();
        jokerPresenter.showContent(this);
        jokerPresenter.continueGame();
    }

    @Override
    protected void applyOutcome(PlayerBoard p) {
        HouseOutcome outcome = getOutcome();
        outcome.apply(p, this);
        HousePresenter housePresenter = new ConsoleHousePresenter();
        housePresenter.showHouseInfo(p);
    }
    
    public void updateContent(House house){
        JokerHouse j = (JokerHouse)house;
        setOutcome(j.getOutcome());
        setJoker(j.getJoker());
    }
}
