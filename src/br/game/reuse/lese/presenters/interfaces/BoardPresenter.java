/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

import br.game.reuse.lese.board.PlayerBoard;

/**
 *
 * @author marlon
 */
public interface BoardPresenter {
    
    /**
     * Shows LeSe's start screen to the user.
     */
    void showStartScreen();
    
    /**
     * Shows LeSe's Set Up Screen to the user. 
     * Allows the user to define game properties such as:
     * - Number of Players
     * - Choose a Project
     */
    void showSetUpScreen();
    
    /**
     * Allows the user to choose how many players will play the game.
     * @return the number of players
     */
    int getNumPlayers();
    
    /**
     * Displays information about the winning player.
     * @param player a player object
     */
    void showWinner(PlayerBoard player);
    
    /**
     * Displays header's game.
     * @param player a player object
     */
    void showHeaderGame(PlayerBoard player);
    
    /**
     * Exit game and go back to main game menu.
     */
    void finalizeGame();
}
