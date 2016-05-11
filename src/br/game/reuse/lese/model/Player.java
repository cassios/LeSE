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
public class Player extends User{
    
    private int idPlayer = 0;
    private int score = 0;

    public Player() {
        //constructor empty.
    }

    public Player(String newName) {
        super(newName);
    }

    public Player(int newIdPlayer, int newScore, int codeUser, String newName) {
        super(codeUser, newName);
        this.idPlayer = newIdPlayer;
        this.score = newScore;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int newIdPlayer) {
        this.idPlayer = newIdPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
    
}
