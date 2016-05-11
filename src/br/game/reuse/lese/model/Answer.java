/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model;

/**
 *
 * @author bruno
 */
public class Answer {
    
    private int idAnswer = 0;
    private Question question = null;
    private String description = "";
    private String status = "";

    public Answer() {
        //constructor empty.
    }

    public Answer(Question newQuestion, String newDescription, String newStatus) {
        this.question = newQuestion;
        this.description = newDescription;
        this.status = newStatus;
    }

    public Answer(int newIdAnswer, Question newQuestion, String newDescription, String newStatus) {
        this.idAnswer = newIdAnswer;
        this.question = newQuestion;
        this.description = newDescription;
        this.status = newStatus;
    }

    public int getCode() {
        return idAnswer;
    }

    public void setCode(int newIdAnswer) {
        this.idAnswer = newIdAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question newQuestion) {
        this.question = newQuestion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }
    
}
