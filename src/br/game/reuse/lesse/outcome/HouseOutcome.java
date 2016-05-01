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
public abstract class HouseOutcome {
    private int points;
    private int nHouses;
    private float extraPenalityPercentege;
    
    //TODO(cass): we may have to do a condicional outcome because we may
    //want to control outcomes that lead the player out of a phase in the board
    protected HouseOutcome(int points, int nHouses, float extraPenality) {
        this.points = points;
        this.nHouses = nHouses;
        this.extraPenalityPercentege = extraPenality;
    }
        
    protected HouseOutcome(int points, int nHouses) {
        this(points, nHouses, 1);
    }
        
    public int getPoints() {
        return this.points;
    }
    
    public int getNumberOfHouses() {
        return this.nHouses;
    }
    
    public abstract void apply();
}
