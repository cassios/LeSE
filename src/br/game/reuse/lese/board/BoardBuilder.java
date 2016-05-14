/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.FinalHouse;
import br.game.reuse.lese.outcome.BonusOutcome;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.InitialHouse;
import br.game.reuse.lese.house.IntermediateHouse;
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
    
    public void buildProject(){
        this.board.createProjectBoard("Projeto ABC", "Teste", 2);
    }

    public void buildHouses() {

        int nHousesPerPhase = 6;
        int idHouse = 0;
        int developmentCycles = this.board.getProjectBoard().getCycle();
        for (int cycle = 1; cycle <= developmentCycles; cycle++) {
            for (DevelopmentPhase phase : DevelopmentPhase.values()) {
                for (int i = 1; i <= nHousesPerPhase; i++) {
                    if (idHouse == 0 || idHouse == ((cycle -1) * nHousesPerPhase * DevelopmentPhase.values().length)) {
                        buildInitialHouse(idHouse, cycle);
                    } else {
                        if (cycle == developmentCycles && idHouse == (cycle * nHousesPerPhase * DevelopmentPhase.values().length) - 1) {
                            buildFinalHouse(idHouse, cycle);
                        } else {
                            if (cycle < developmentCycles && (idHouse == (cycle * nHousesPerPhase * DevelopmentPhase.values().length) - 1)) {
                                buildIntermediateHouse(idHouse, cycle);
                            } else {
                                if (i % 3 != 0) {
                                    buildQuestionHouse(phase, idHouse, cycle);
                                } else {
                                    buildJokerHouse(phase, idHouse, cycle);
                                }
                            }
                        }
                    }
                    idHouse++;
                }
            }
        }
    }

    public void buildInitialHouse(int idHouse, int cycle) {
        String message = "Parabéns! \nVocê acaba de ser contratado pela empresa XYZ para trabalhar como engenheiro de software.\n"
                + "Prepare-se! Muitos desafios estão por vir! Novos conhecimentos serão obtidos e muitos obstáculos serão encontrados.\n"
                + "Mas fique tranquilo. No final tudo isso valerá apena.\n";

        HouseOutcome outcome = new BonusOutcome(1, 10, (float) 0.0);
        House initHouse = new InitialHouse(idHouse, outcome, null, message, cycle);
        this.board.addHouse(initHouse);
    }

    public void buildIntermediateHouse(int idHouse, int cycle) {
        String message = "Parabéns! \nVocê acaba de finalizar o ciclo "+cycle+" de desenvolvimento do software.\n\n"
                + "Prepare-se para o início do ciclo "+ (cycle+1) + ".";

        HouseOutcome outcome = new BonusOutcome(2, 0, (float) 0.0);
        House intermediateHouse = new IntermediateHouse(idHouse, outcome, null, message, cycle);
        this.board.addHouse(intermediateHouse);
    }

    public void buildFinalHouse(int idHouse, int cycle) {
        String message = "Parabéns! \nVocê acaba completou todos os ciclos de desenvolvimento do software.\n\n"
                + "Fim do jogo.";

        HouseOutcome outcome = new BonusOutcome(0, 0, (float) 0.0);
        House finalHouse = new FinalHouse(idHouse, outcome, null, message, cycle);
        this.board.addHouse(finalHouse);
    }

    public void buildQuestionHouse(DevelopmentPhase phase, int idHouse, int cycle) {
        QuestionBoard q = new QuestionBoard("desc", "explanation");
        q.addChoice("42", true);
        for (int j = 0; j < 3; j++) {
            q.addChoice(Integer.toString(j), false);
        }

        HouseOutcome outcome = new BonusOutcome(4, 5, (float) 1.0);
        House questionHouse = new QuestionHouse(idHouse, outcome, phase, q, cycle);
        this.board.addHouse(questionHouse);
    }

    public void buildJokerHouse(DevelopmentPhase phase, int idHouse, int cycle) {
        JokerBoard j = new JokerBoard("title", "explanation");
        HouseOutcome outcome = new BonusOutcome(4, 3, (float) 1.0);
        House jokerHouse = new JokerHouse(idHouse, outcome, phase, j, cycle);
        this.board.addHouse(jokerHouse);
    }

}
