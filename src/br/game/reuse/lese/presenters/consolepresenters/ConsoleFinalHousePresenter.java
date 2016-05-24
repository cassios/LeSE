/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.house.FinalHouse;
import br.game.reuse.lese.house.House;
import br.game.reuse.lese.presenters.interfaces.MessagePresenter;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ConsoleFinalHousePresenter implements MessagePresenter{

    @Override
    public void showContent(House house) {
        FinalHouse initialHouse = (FinalHouse)house;
        System.out.println(initialHouse.getMessage());
    }
    
}
