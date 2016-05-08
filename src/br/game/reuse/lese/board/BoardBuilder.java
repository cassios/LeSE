/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.outcome.BonusOutcome;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.InitialHouse;
import br.game.reuse.lese.house.QuestionHouse;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.question.*;

/**
 *
 * @author cass
 */
public class BoardBuilder {

    private Board board;

    public void buildBoard() {
        this.board = Board.getInstance();
    }

    public void buildHouses() {

        int nHousesPerPhase = 6;
        int idHouse = 0;
        for (DevelopmentPhase phase : DevelopmentPhase.values()) {
            for (int i = 1; i <= nHousesPerPhase; i++) {
                if (idHouse == 0) {
                    String message = "Parabéns! \nVocê acaba de ser contratado pela empresa XYZ para trabalhar como engenheiro de software. "
                    + "Prepare-se, muitos desafios estão por vir. Novos conhecimentos serão obtidos e muitos obstáculos serão encontrados. "
                    + "Mas fique tranquilo. No final tudo isso valerá apenas.\n\n"
                    + "Você acaba de ganhar 10 pontos pela sua contratação.";

                    HouseOutcome outcome = new BonusOutcome(1, 10, (float) 0.0);
                    House initHouse = new InitialHouse(idHouse, outcome, null, message);
                    this.board.addHouse(initHouse);
                } else {
                    if (i % 2 != 0) {
                        Question q = new Question("desc", "explanation");
                        q.addChoice("42", true);
                        for (int j = 0; j < 3; j++) {
                            q.addChoice(Integer.toString(j), false);
                        }

                        HouseOutcome outcome = new BonusOutcome(2, 5, (float) 1.0);
                        House questionHouse = new QuestionHouse(1, outcome, phase, q);
                        this.board.addHouse(questionHouse);
                    } else {
                        HouseOutcome outcome = new BonusOutcome(2, 3, (float) 1.0);
                        House jokerHouse = new JokerHouse(1, outcome, phase, "desc");
                        this.board.addHouse(jokerHouse);
                    }
                }
                idHouse++;
            }
        }
    }

}
