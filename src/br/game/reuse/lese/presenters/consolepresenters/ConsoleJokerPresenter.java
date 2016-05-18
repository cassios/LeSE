/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.outcome.BonusOutcome;
import br.game.reuse.lese.presenters.interfaces.MessagePresenter;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ConsoleJokerPresenter implements MessagePresenter{

    @Override
    public void showContent(House house) {
        JokerHouse joker = (JokerHouse)house;
        if (joker.getOutcome() instanceof BonusOutcome) {
            System.out.println("\n" + joker.getJoker().getTitle() + "\n" + joker.getJoker().getDescription()
                    + "\nVocê ganhou " + joker.getOutcome().getPoints() + " pontos.\n");
        } else {
            System.out.println("\n" + joker.getJoker().getTitle() + "\n" + joker.getJoker().getDescription()
                    + "\nVocê perdeu " + joker.getOutcome().getPoints() + " pontos.\n");
        }
    }

    @Override
    public void continueGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para continuar.");
        int option = scanner.nextInt();
    }
    
}
