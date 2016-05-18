/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.presenters.interfaces.BoardPresenter;

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
        System.out.println("Jogador " + player.getNickname() + " ganhou a partida. Parabens!");
    }
    
}
