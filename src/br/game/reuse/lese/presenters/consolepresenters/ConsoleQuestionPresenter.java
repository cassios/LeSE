/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.presenters.interfaces.QuestionPresenter;
import br.game.reuse.lese.question.QuestionBoard;
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
    public void showChoices(QuestionBoard question) {
        int option = 1;
        for (String choice : question.getChoices()) {
            System.out.println(option + " - " + choice);
            option++;
        }
    }

    @Override
    public String getPlayerAnswer(QuestionBoard question) {
        int option = 0;
        while (option < 1 || option > 4) {
            System.out.println("Digite a opção que você acha correta: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if (option < 1 || option > 4) {
                System.out.println("Opção não existente. Digite a opção de 1 a 4 para responder a questão!!!");
            }
        }
        Object choices[] = question.getChoices().toArray();
        return String.valueOf(choices[1]);
    }

    @Override
    public void showFeedback(String feedback) {
        System.out.println(feedback);
    }
    
}
