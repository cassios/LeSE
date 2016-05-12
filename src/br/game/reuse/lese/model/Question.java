/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model;

import java.util.List;

/**
 *
 * @author bruno
 */
public class Question {
    
    private int idQuestion = 0;
    private Phase phase = new Phase();
    private String description = "";
    private String explanation = "";
    private int score = 0;
    private int house = 0;
    private List<Answer> answer = null;

    public Question() {
        //constructor empty.
    }

    public Question(Phase newPhase, String newDescription, String newExplanation, int newScore, int newHouse, List<Answer> newAnswer) {
        this.phase = newPhase;
        this.description = newDescription;
        this.explanation = newExplanation;
        this.score = newScore;
        this.house = newHouse;
        this.answer = newAnswer;
    }

    public Question(int newIdQuestion, Phase newPhase, String newDescription, String newExplanation, int newScore, int newHouse, List<Answer> newAnswer) {
        this.idQuestion = newIdQuestion;
        this.phase = newPhase;
        this.description = newDescription;
        this.explanation = newExplanation;
        this.score = newScore;
        this.house = newHouse;
        this.answer = newAnswer;
    }

    public int getIdQueston() {
        return idQuestion;
    }

    public void setIdQueston(int newIdQuestion) {
        this.idQuestion = newIdQuestion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String newExplanation) {
        this.explanation = newExplanation;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int newHouse) {
        this.house = newHouse;
    }
    
    public void setPhase(Phase newPhase){
        this.phase = newPhase;
    }
    
    public Phase getPhase(){
        return this.phase;
    }
    
    public void setAnswer(List<Answer> answer){
        this.answer = answer;
    }
    
    public List<Answer> getAnswer(){
        return this.answer;
    }
    
}
