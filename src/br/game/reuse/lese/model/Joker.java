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
public class Joker {
    
    private int idJoker = 0;
    private Phase phase = new Phase();
    private String title = "";
    private String description = "";
    private String action = "";
    private int score = 0;
    private int house = 0;

    public Joker() {
        //constructor empty.
    }

    public Joker(String newTitle, Phase newPhase, String newDescription, String newAction, int newScore, int newHouse) {
        this.phase = newPhase;
        this.title = newTitle;
        this.description = newDescription;
        this.action = newAction;
        this.score = newScore;
        this.house = newHouse;
    }

    public Joker(int newIdJoker, Phase newPhase, String newTitle, String newDescription, String newAction, int newScore, int newHouse) {
        this.idJoker = newIdJoker;
        this.phase = newPhase;
        this.title = newTitle;
        this.description = newDescription;
        this.action = newAction;
        this.score = newScore;
        this.house = newHouse;
    }

    public int getCode() {
        return idJoker;
    }

    public void setCode(int newIdJoker) {
        this.idJoker = newIdJoker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String newAction) {
        this.action = newAction;
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
    
}
