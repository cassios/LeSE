/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lesse.house.House;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cass
 */
public class Board {
    private static Board instance;
    private ArrayList<House> houses;
    private HashMap<Player, Integer> players;
    
    private Board() {
        this.houses = new ArrayList<>();
    }
    
    public static Board getInstance() {
        if(instance == null) {
            instance = new Board();
        }
        return instance;
    }
    
    public House getHouseAtIndex(int i) {
        if(i >= this.houses.size()) {
            return null;
        }
        return this.houses.get(i);
    }
    
    public int addHouse(House house) {
        this.houses.add(house);
        return this.houses.size();
    }
        
    private int getPlayerHouseId(Player p) {
        return this.players.get(p);
    }
        
    public House getPlayerHouse(Player p) {
        return getHouseAtIndex(getPlayerHouseId(p));
    }
    
    public int updatePlayerPosition(Player p, int nHouses) {
        int currentPos = getPlayerHouseId(p);
        int newPos = currentPos + nHouses;
        return this.players.put(p, newPos);
    }
}
