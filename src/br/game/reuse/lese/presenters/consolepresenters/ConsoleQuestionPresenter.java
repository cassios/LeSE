/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.QuestionHouse;
import br.game.reuse.lese.presenters.interfaces.QuestionPresenter;
import br.game.reuse.lese.question.QuestionBoard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marlon
 */
public class ConsoleQuestionPresenter implements QuestionPresenter {

    @Override
    public void showQuestion(QuestionBoard question) {
        System.out.println(question.getDescription());
    }

    @Override
    public List<String> showChoices(QuestionBoard question) {
        int option = 1;
        List<String> choices = new ArrayList<>();
        for(String choice : question.getChoices()){
            choices.add(choice);
        }
        Collections.shuffle(choices);
        for (String choice : choices) {
            System.out.println(option + " - " + choice);
            option++;
        }
        return choices;
    }

    @Override
    public String getPlayerAnswer(List<String> choices) {
        int option = 0;
        while (option < 1 || option > 4) {
            System.out.println("Digite a opção que você acha correta: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if (option < 1 || option > 4) {
                System.out.println("Essa opção não existe! Digite a opção de 1 a 4 para responder a questão!!!");
            }
        }
        return choices.get(option-1);
    }

    @Override
    public void showFeedback(House house) {
        QuestionHouse question = (QuestionHouse) house;
        String feedback = "";
        if(question.isCorrect()){
            feedback = "Parabéns, você acertou!!!\n" + question.getQuestion().getEplanation()
                        + "\nVocê ganhou " + question.getOutcome().getPoints() + " pontos. Avance " + question.getOutcome().getNumberOfHouses() + " casa(s).";
        }else{
            feedback = "Que pena, você errou.\n" + question.getQuestion().getEplanation()
                        + "\nVocê perdeu " + question.getOutcome().getPoints() + " pontos.";
        }
        System.out.println("\n" + feedback + "\n");
    }
    
}
