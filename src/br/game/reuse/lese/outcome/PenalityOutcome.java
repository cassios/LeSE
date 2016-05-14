/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.outcome;

import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.question.JokerBoard;

/**
 *
 * @author cass
 */
public class PenalityOutcome extends HouseOutcome {

    public PenalityOutcome(int nHouses, int points) {
        super(points, nHouses, 1);
    }

    @Override
    public void apply(PlayerBoard p, House house) {
        HouseOutcome outcome = house.getOutcome();
        JokerHouse joker = (JokerHouse) house;
        if (outcome instanceof BonusOutcome) {
            System.out.println(joker.getJoker().getTitle() + "\n" + joker.getJoker().getDescription()
                    + "\nVocê ganhou " + getPoints() + " pontos. Avance " + getNumberOfHouses() + " casa(s).");
            p.creditPoints(getPoints());
            p.move(getNumberOfHouses());
        } else {
            System.out.println(joker.getJoker().getTitle() + "\n" + joker.getJoker().getDescription()
                    + "\nVocê perdeu " + getPoints() + " pontos. Recue " + getNumberOfHouses() + " casa(s).");
            p.debitPoints(getPoints());
            p.move(-getNumberOfHouses());
        }
    }

}
