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
public class Student extends User{
    
    private int codeStudent = 0;
    private int score = 0;

    public Student() {
        //constructor empty.
    }

    public Student(String newName) {
        super(newName);
    }

    public Student(int newCodeStudent, int newScore, int codeUser, String newName) {
        super(codeUser, newName);
        this.codeStudent = newCodeStudent;
        this.score = newScore;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int newCodeStudent) {
        this.codeStudent = newCodeStudent;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
    
}
