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
import br.game.reuse.lese.presenters.consolepresenters.ConsoleIntermediateHousePresenter;
import br.game.reuse.lese.presenters.interfaces.HousePresenter;
import br.game.reuse.lese.presenters.interfaces.MessagePresenter;

/**
 *
 * @author bruno
 */
public class IntermediateHouse extends House {

    private final String message;

    public IntermediateHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, String msg, int cycle) {
        super(id, outcome, phase, cycle);
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    protected void presentContent() {
//        System.out.println(this.message);
    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        MessagePresenter intermediatePresenter = new ConsoleIntermediateHousePresenter();
        intermediatePresenter.showContent(this);
        intermediatePresenter.continueGame();
    }

    @Override
    protected void applyOutcome(PlayerBoard p) {
        HouseOutcome outcome = getOutcome();
        outcome.apply(p, this);
        HousePresenter housePresenter = new ConsoleHousePresenter();
        housePresenter.showHouseInfo(p);
    }

}
