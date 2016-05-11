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
public class Teacher extends User{
    
    private String cpf = "";
    private String institution = "";
    private String email = "";
    private String password = "";

    public Teacher() {
        //constructor empty.
    }

    public Teacher(String newCpf, String newInstitution, String newEmail, String newPassword, String newName) {
        super(newName);
        this.cpf = newCpf;
        this.institution = newInstitution;
        this.email = newEmail;
        this.password = newPassword;
    }

    public Teacher(String newCpf, String newInstitution, String newEmail, String newPassword, int newIdUser, String newName) {
        super(newIdUser, newName);
        this.cpf = newCpf;
        this.institution = newInstitution;
        this.email = newEmail;
        this.password = newPassword;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String newInstitution) {
        this.institution = newInstitution;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    
}
