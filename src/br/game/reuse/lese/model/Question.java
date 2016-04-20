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
public class Question {
    
    private int code = 0;
    private Phase phase = null;
    private Projects project = null;
    private int cycle = 0;
    private String text = "";
    private String explication = "";
    private int score = 0;

    public Question() {
        //constructor empty.
    }

    public Question(Phase newPhase, Projects newProject, int newCycle, String newText, String newExplication, int newScore) {
        this.phase = newPhase;
        this.project = newProject;
        this.cycle = newCycle;
        this.text = newText;
        this.explication = newExplication;
        this.score = newScore;
    }

    public Question(int newCode, Phase newPhase, Projects newProject, int newCycle, String newText, String newExplication, int newScore) {
        this.code = newCode;
        this.project = newProject;
        this.cycle = newCycle;
        this.phase = newPhase;
        this.text = newText;
        this.explication = newExplication;
        this.score = newScore;
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

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String newExplication) {
        this.explication = newExplication;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
    
}
