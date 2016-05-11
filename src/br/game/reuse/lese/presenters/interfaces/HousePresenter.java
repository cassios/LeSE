/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.interfaces;

import br.game.reuse.lese.board.PlayerBoard;

/**
 *
 * @author marlon
 */
public interface HousePresenter {

    /**
     * Displays information about the house when player arrives in it.
     * Example: Current Phase, Type of House, House Position, etc
     * @param p
     */
    void showHouseInfo(PlayerBoard p);
}
