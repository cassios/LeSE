/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.house;

import br.game.reuse.lese.board.DevelopmentPhase;
import br.game.reuse.lese.board.Player;
import br.game.reuse.lese.outcome.HouseOutcome;
import br.game.reuse.lese.question.Question;
import java.util.Scanner;

/**
 *
 * @author cass
 */
public class QuestionHouse extends House {

    private Question question;
    private boolean isCorrect;

    public QuestionHouse(int id, HouseOutcome outcome, DevelopmentPhase phase, Question q) {
        super(id, outcome, phase);
        this.question = q;
        this.isCorrect = false;
    }

    public void setQuestion(Question q) {
        this.question = q;
    }

    public Question getQuestion() {
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
    protected void interactWithPlayer(Player p) {
        int option = 0;
        while (option < 1 || option > 4) {
            System.out.println("Digite a opção que você acha correta: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if (option >= 1 && option <= 4) {
                Object choices[] = this.question.getChoices().toArray();
                this.isCorrect = this.question.verifyAnswer(String.valueOf(choices[option - 1]));
            }else{
                System.out.println("Opção não existente. Digite a opção de 1 a 4 para responder a questão!!!");
            }
        }
    }

    @Override
    protected void applyOutcome(Player p) {
        int earnedPoints = p.getPawnPosition().getOutcome().getPoints();
        int nHouses = p.getPawnPosition().getOutcome().getNumberOfHouses();
        if (this.isCorrect) {
            System.out.println("Parabéns, você acertou.\n" + this.question.getEplanation()
                    + "\nVocê ganhou " + earnedPoints + ". Avance " + nHouses + " casa(s).");
            p.creditPoints(earnedPoints);
            p.move(nHouses);
        } else {
            House playerHouse = p.getPawnPosition();
            if ((playerHouse.getId() - nHouses) < 1) {
                System.out.println("Que pena, você errou.\n" + this.question.getEplanation()
                        + "\nVocê perdeu " + earnedPoints + ".");
                p.creditPoints(-earnedPoints);
            } else {
                System.out.println("Que pena, você errou.\n" + this.question.getEplanation()
                        + "\nVocê perdeu " + earnedPoints + ". Recue " + nHouses + " casa(s).");
                p.creditPoints(-earnedPoints);
                p.move(-nHouses);
            }
        }
        System.out.println("Casa Atual: " + (p.getPawnPosition().getId() + 1));
        System.out.println("Pontuação Atual: " + p.getCurrentScore());
        this.isCorrect = false;
    }
}
