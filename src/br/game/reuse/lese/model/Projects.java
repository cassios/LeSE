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
public class Projects {
    
    private int code = 0;
    private String name = "";
    private String description = "";
    private int cycle = 0;

    public Projects() {
        //constructor empty.
    }

    public Projects(String newName, String newDescription, int newCycle) {
        this.name = newName;
        this.description = newDescription;
        this.cycle = newCycle;
    }

    public Projects(int newCode, String newName, String newDescription, int newCycle) {
        this.code = newCode;
        this.name = newName;
        this.description = newDescription;
        this.cycle = newCycle;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int newCode) {
        this.code = newCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int newCycle) {
        this.cycle = newCycle;
    }
    
}
