/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.house.JokerHouse;
import br.game.reuse.lese.presenters.interfaces.MessagePresenter;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ConsoleJokerHousePresenter implements MessagePresenter{

    @Override
    public void showContent(House house) {
        JokerHouse joker = (JokerHouse)house;
        System.out.println(joker.getJoker().getDescription());
    }

    @Override
    public void continueGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para continuar.");
        int option = scanner.nextInt();
    }
    
}
