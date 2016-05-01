/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lesse.house.House;

/**
 *
 * @author cass
 */
public class Player {
    private final String nickname;
    private int accumulatedPoints;
    private final Pawn pawn;
    
    Player(String nickname) {
        this.nickname = nickname;
        this.accumulatedPoints = 0;
        this.pawn = new Pawn("red");
    }
    
    public House getPawnPosition() {
        Board board = Board.getInstance();
        return board.getPlayerHouse(this);
    }
    
    public void move(int nHouses) {
        Board board = Board.getInstance();
        board.updatePlayerPosition(this, nHouses);
    }
    
    public void creditPoints(int earnedPoints) {
        this.accumulatedPoints += earnedPoints;
    }
    
    public int getCurrentScore() {
        return this.accumulatedPoints;
    }
    
}
