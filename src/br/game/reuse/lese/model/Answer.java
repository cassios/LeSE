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
    
    private int code = 0;
    private Question question = null;
    private String text = "";
    private String status = "";

    public Answer() {
        //constructor empty.
    }

    public Answer(Question newQuestion, String newText, String newStatus) {
        this.question = newQuestion;
        this.text = newText;
        this.status = newStatus;
    }

    public Answer(int newCode, Question newQuestion, String newText, String newStatus) {
        this.code = newCode;
        this.question = newQuestion;
        this.text = newText;
        this.status = newStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int newCode) {
        this.code = newCode;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question newQuestion) {
        this.question = newQuestion;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }
    
}
