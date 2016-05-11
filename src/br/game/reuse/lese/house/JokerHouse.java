/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.question.JokerBoard;
import java.util.Scanner;

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
        System.out.println(this.joker.getDescription());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para continuar.");
        int option = scanner.nextInt();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void applyOutcome(PlayerBoard p) {
        HouseOutcome outcome = getOutcome();
        outcome.apply(p, this);
        System.out.println("Casa Atual: " + (p.getPawnPosition().getId() + 1));
        System.out.println("Pontuação Atual: " + p.getCurrentScore());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
