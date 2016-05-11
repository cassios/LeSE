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
public class ProjectBoard {
    private String name;
    private String description;
    private int cycle;
    
    public ProjectBoard(String name, String description, int cycle){
        this.name = name;
        this.description = description;
        this.cycle = cycle;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public int getCycle(){
        return this.cycle;
    }
}
