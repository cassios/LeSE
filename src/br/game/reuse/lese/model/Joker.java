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
    
    private int code = 0;
    private Phase phase = null;
    private Projects project = null;
    private int cycle = 0;
    private String title = "";
    private String text = "";
    private String action = "";
    private int score = 0;
    private int house = 0;

    public Joker() {
        //constructor empty.
    }

    public Joker(Phase newPhase, Projects newProject, int newCycle, String newTitle, String newText, String newAction, int newScore, int newHouse) {
        this.phase = newPhase;
        this.project = newProject;
        this.cycle = newCycle;
        this.title = newTitle;
        this.text = newText;
        this.action = newAction;
        this.score = newScore;
        this.house = newHouse;
    }

    public Joker(int newCode, Phase newPhase, Projects newProject, int newCycle, String newTitle, String newText, String newAction, int newScore, int newHouse) {
        this.code = newCode;
        this.phase = newPhase;
        this.project = newProject;
        this.cycle = newCycle;
        this.title = newTitle;
        this.text = newText;
        this.action = newAction;
        this.score = newScore;
        this.house = newHouse;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int newCode) {
        this.code = newCode;
    }

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase newPhase) {
        this.phase = newPhase;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects newProject) {
        this.project = newProject;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int newCycle) {
        this.cycle = newCycle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
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
    
}
