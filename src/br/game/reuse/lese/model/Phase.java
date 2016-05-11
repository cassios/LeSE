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
public class Phase {
    private int idPhase = 0;
    private String name = "";
    
    public Phase(){
        
    }
    
    public Phase(String newName){
        this.name = newName;
    }
    
    public Phase(int newIdPhase, String newName){
        this.idPhase = newIdPhase;
        this.name = newName;
    }
    
    public void setIdPhase(int newIdPhase){
        this.idPhase = newIdPhase;
    }
    
    public int getIdPhase(){
        return this.idPhase;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getName(){
        return this.name;
    }
    
}
