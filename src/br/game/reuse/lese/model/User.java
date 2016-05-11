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
public class User {
    
    private int idUser = 0;
    private String name = "";

    public User() {
        //constructor empty.
    }

    public User(String newName) {
        this.name = newName;
    }

    public User(int newIdUser, String newName) {
        this.idUser = newIdUser;
        this.name = newName;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int newIdUser) {
        this.idUser = newIdUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
}
