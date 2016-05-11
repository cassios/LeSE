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
public class Project {
    
    private int idProject = 0;
    private String name = "";
    private String description = "";
    private int cycle = 0;

    public Project() {
        //constructor empty.
    }

    public Project(String newName, String newDescription, int newCycle) {
        this.name = newName;
        this.description = newDescription;
        this.cycle = newCycle;
    }

    public Project(int newIdProject, String newName, String newDescription, int newCycle) {
        this.idProject = newIdProject;
        this.name = newName;
        this.description = newDescription;
        this.cycle = newCycle;
    }

    public int getCode() {
        return idProject;
    }

    public void setCode(int newIdProject) {
        this.idProject = newIdProject;
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
