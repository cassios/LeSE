/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lesse.outcome;

/**
 *
 * @author cass
 */
public class PenalityOutcome extends HouseOutcome {
    
    PenalityOutcome(int nHouses, int points) {
        super(points, nHouses, 1);
    }
    
    @Override
    public void apply() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
