/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.question;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cass
 */
public class Question {
    private String description;
    private String explanation;
    private Set<String> choices;
    private String answer;
    
    public Question(String description, String explanation) {
        this.description = description;
        this.explanation = explanation;
        this.choices = new HashSet<>();
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getEplanation() {
        return this.explanation;
    }
    
    public void addChoice(String choice, boolean isAnswer) {
        this.choices.add(choice);
        if(isAnswer) this.answer = choice;
    }
        
    public Set<String> getChoices() {
        return this.choices;
    }
    
    public boolean verifyAnswer(String playerAnswer) {
        return playerAnswer.equals(this.answer);
    }
}
