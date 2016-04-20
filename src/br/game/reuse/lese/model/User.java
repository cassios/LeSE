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
    
    private int code = 0;
    private String name = "";

    public User() {
        //constructor empty.
    }

    public User(String newName) {
        this.name = newName;
    }

    public User(int newCode, String newName) {
        this.code = newCode;
        this.name = newName;
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
    
}
