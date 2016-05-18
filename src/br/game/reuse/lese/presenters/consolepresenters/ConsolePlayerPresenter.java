/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.presenters.interfaces.PlayerPresenter;
import java.util.Scanner;

/**
 *
 * @author marlon
 */
public class ConsolePlayerPresenter implements PlayerPresenter {

    @Override
    public String getPlayerName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Jogador: ");
        String playerName = sc.next();
        return playerName;
    }

    @Override
    public void showMovement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
