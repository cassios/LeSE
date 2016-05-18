/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

/**
 *
 * @author bruno
 */
public interface GamePresenter {

    /**
     * Shows LeSe's menu screen to the user.
     * @return 
     */
    int menu();

    /**
     * Shows LeSe's Ranking Screen to the user.
     */
    void showRanking();

    /**
     * Shows LeSe's Help Screen to the user.
     */
    void showHelp();

    /**
     * Shows LeSe's Help Screen to the user.
     */
    void showExit();

    /**
     * Shows LeSe's Default Screen to the user.
     */
    void showDefault();

    /**
     * Shows LeSe's Default Screen to the user.
     */
    void welcome();
}
