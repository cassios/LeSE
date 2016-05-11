/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.question;

/**
 *
 * @author bruno
 */
public class JokerBoard {
    private String title;
    private String description;
    
    public JokerBoard(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getDescription(){
        return this.description;
    }
    
}
