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
public abstract class House {
    private final int id;
    private HouseOutcome outcome;
    private final DevelopmentPhase devPhase;
    
    House(int id, HouseOutcome outcome, DevelopmentPhase phase) {
        this.id = id;
        this.outcome = outcome;
        this.devPhase = phase;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setOutcome(HouseOutcome outcome) {
        this.outcome = outcome;
    }
    
    public HouseOutcome getOutcome() {
        return this.outcome;
    }
    
    public DevelopmentPhase getDevPhase() {
        return this.devPhase;
    }
        
    //Design Pattern: Template Method
    public final void execute(Player p) {
        presentContent();
        interactWithPlayer(p);
        applyOutcome(p);
    }
    
    protected abstract void presentContent();
    protected abstract void interactWithPlayer(Player p);
    protected abstract void applyOutcome(Player p);
}
