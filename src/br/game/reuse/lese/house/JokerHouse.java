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
public class JokerHouse extends House {
    private final String description;
    
    JokerHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, String description) {
        super(id, outcome, phase);
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }

    @Override
    protected void presentContent() {
        System.out.println(this.description);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void interactWithPlayer(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void applyOutcome(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
