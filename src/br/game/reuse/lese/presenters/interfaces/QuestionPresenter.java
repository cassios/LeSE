/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

import br.game.reuse.lese.question.QuestionBoard;

/**
 *
 * @author marlon
 */
public interface QuestionPresenter {
    
    /**
     * Displays the question to the player.
     *
     * @param question
     */
    void showQuestion(QuestionBoard question);
    
    /**
     * Displays question choices to the player.
     * @param question
     */
    void showChoices(QuestionBoard question);
    
    /**
     * Obtains answer from the player
     * @param question
     * @return player answer
     */
    String getPlayerAnswer(QuestionBoard question);
    
    /**
     * Gives feedback to the user based on their answer.
     * @param feedback
     */
    void showFeedback(String feedback);
}
