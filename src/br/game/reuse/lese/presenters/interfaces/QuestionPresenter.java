/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

/**
 *
 * @author marlon
 */
public interface QuestionPresenter {
    
    /**
     * Displays the question to the player.
     *
     */
    void showQuestion();
    
    /**
     * Displays question choices to the player.
     */
    void showChoices();
    
    /**
     * Obtains answer from the player
     * @return player answer
     */
    String getPlayerAnswer();
    
    /**
     * Gives feedback to the user based on their answer.
     */
    void showFeedback();
}
