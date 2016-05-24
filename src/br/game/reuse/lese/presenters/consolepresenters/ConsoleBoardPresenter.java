/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.presenters.interfaces.BoardPresenter;
import br.game.reuse.lese.presenters.interfaces.GamePresenter;

/**
 *
 * @author marlon
 */
public class ConsoleBoardPresenter implements BoardPresenter {

    @Override
    public void showStartScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showSetUpScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showWinner(PlayerBoard player) {
        System.out.println("Player " + player.getNickname() + " won!!!");
    }

    @Override
    public void showHeaderGame(PlayerBoard player) {
        GamePresenter gamePresenter = new ConsoleGamePresenter();
        gamePresenter.cleanConsole();
        System.out.println("----------------------------------Informações---------------------------------------------");
        System.out.print("Jogador: ");
        System.out.println(player.getNickname());
        System.out.print("Pontuação: ");
        System.out.println(player.getCurrentScore());
        System.out.print("Ciclo Atual: ");
        System.out.println(player.getCurrentCycle());
        System.out.print("Casa Atual: ");
        System.out.println(player.getCurrentPos() + 1);
        System.out.println("------------------------------------------------------------------------------------------\n");
    }

    @Override
    public void finalizeGame() {
        System.out.println("\f");
        System.out.println("Você finalizou o jogo!");
    }
    
}
