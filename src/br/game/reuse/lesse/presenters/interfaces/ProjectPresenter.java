/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lesse.presenters.interfaces;

/**
 *
 * @author marlon
 */
public interface ProjectPresenter {
    
    /**
     * Displays available projects to the player.
     * 
     */
    void showProjects();
    
    /**
     * Gets the project selected by the player.
     * @return project id selected by the player
     */
    int getPlayerChoice();
    
}
