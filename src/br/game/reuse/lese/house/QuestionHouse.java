/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.question.QuestionBoard;
import java.util.Scanner;

/**
 *
 * @author cass
 */
public class QuestionHouse extends House {

    private QuestionBoard question;
    private boolean correct;

    public QuestionHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, QuestionBoard q, int cycle) {
        super(id, outcome, phase, cycle);
        this.question = q;
        this.correct = false;
    }

    public void setQuestion(QuestionBoard q) {
        this.question = q;
    }

    public QuestionBoard getQuestion() {
        return this.question;
    }

    @Override
    protected void presentContent() {
        System.out.println(this.question.getDescription());
        int option = 1;
        for (String choice : this.question.getChoices()) {
            System.out.println(option + " - " + choice);
            option++;
        }
    }

    @Override
    protected void interactWithPlayer(PlayerBoard p) {
        int option = 0;
        while (option < 1 || option > 4) {
            System.out.println("Digite a opção que você acha correta: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if (option >= 1 && option <= 4) {
                Object choices[] = this.question.getChoices().toArray();
                this.correct = this.question.verifyAnswer(String.valueOf(choices[option - 1]));
            }else{
                System.out.println("Opção não existente. Digite a opção de 1 a 4 para responder a questão!!!");
            }
        }
    }

    @Override
    protected void applyOutcome(PlayerBoard p) {
        HouseOutcome outcome = getOutcome();
        outcome.apply(p, this);
        System.out.println("Casa Atual: " + (p.getPawnPosition().getId() + 1));
        System.out.println("Pontuação Atual: " + p.getCurrentScore());
        this.correct = false;
    }
    
    public boolean isCorrect(){
        return this.correct;
    }
}
