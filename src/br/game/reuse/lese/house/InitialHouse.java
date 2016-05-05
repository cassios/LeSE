/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.Player;
import br.game.reuse.lese.outcome.HouseOutcome;

/**
 *
 * @author cass
 */
public class InitialHouse extends House {
    private final String message;
    
    public InitialHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, String msg) {
        super(id, outcome, phase);
        this.message = msg;
    }
    
    public String getMessage() {
        return this.message;
    }

    @Override
    protected void presentContent() {
        System.out.println(this.message);
    }

    @Override
    protected void interactWithPlayer(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void applyOutcome(Player p) {
        int earnedPoints = p.getPawnPosition().getOutcome().getPoints();
        int nHouses = p.getPawnPosition().getOutcome().getNumberOfHouses();
        p.creditPoints(earnedPoints);
        p.move(nHouses);
    }
}