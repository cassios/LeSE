/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;

/**
 *
 * @author cass
 */
public class Pawn {
    private final String color;
    
    public Pawn(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
}
