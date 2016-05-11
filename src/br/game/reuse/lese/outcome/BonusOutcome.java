/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.outcome;

import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.IntermediateHouse;
import br.game.reuse.lese.house.QuestionHouse;

/**
 *
 * @author cass
 */
public class BonusOutcome extends HouseOutcome {

    public BonusOutcome(int nHouses, int points, float extraPenality) {
        super(points, nHouses, extraPenality);
    }

    public BonusOutcome(int nHouses, int points) {
        super(points, nHouses, 1);
    }

    @Override
    public void apply(PlayerBoard p, House house) {
        if (house instanceof QuestionHouse) {
            QuestionHouse question = (QuestionHouse) house;
            if (question.isCorrect()) {
                System.out.println("Parabéns, você acertou.\n" + question.getQuestion().getEplanation()
                        + "\nVocê ganhou " + getPoints() + ". Avance " + getNumberOfHouses() + " casa(s).");
                p.creditPoints(getPoints());
                p.move(getNumberOfHouses());
            } else {
//                House playerHouse = p.getPawnPosition();
//                if ((playerHouse.getId() - getNumberOfHouses()) < 1) {
//                    System.out.println("Que pena, você errou.\n" + question.getQuestion().getEplanation()
//                            + "\nVocê perdeu " + getPoints() + ". Volte/Permaneça na casa 1.");
//                    p.debitPoints(getPoints());
//                    p.move(p.getPawnPosition().getId() - 1);
//                } else {
                    System.out.println("Que pena, você errou.\n" + question.getQuestion().getEplanation()
                            + "\nVocê perdeu " + getPoints() + ". Recue " + getNumberOfHouses() + " casa(s).");
                    p.debitPoints(getPoints());
                    p.move(-getNumberOfHouses());
//                }
            }
        } else if(house instanceof IntermediateHouse){
            p.creditPoints(getPoints());
            p.increasingCycle();
            p.move(getNumberOfHouses());
        } else {
            p.creditPoints(getPoints());
            p.move(getNumberOfHouses());
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
