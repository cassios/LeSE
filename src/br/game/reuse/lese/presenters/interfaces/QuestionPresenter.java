/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

import br.game.reuse.lese.question.QuestionBoard;
import java.util.List;

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
     * @return 
     */
    List<String> showChoices(QuestionBoard question);
    
    /**
     * Obtains answer from the player
     * @param choices
     * @return player answer
     */
    String getPlayerAnswer(List<String> choices);
    
    /**
     * Gives feedback to the user based on their answer.
     * @param feedback
     */
    void showFeedback(String feedback);
}
