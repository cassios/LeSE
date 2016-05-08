/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

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
        this.players = new HashMap<>();
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
        return this.houses.size() - 1;
    }
    
    public void addPlayer(String nickname, String pawnColor) {
        Player newPlayer = new Player(nickname);
        this.players.put(newPlayer, 0);
    }
    
    public ArrayList<Player> getPlayers() {
        ArrayList<Player> playersArray = new ArrayList<>();
        for (Entry<Player, Integer> item : this.players.entrySet()) {
            playersArray.add(item.getKey());
        }
        return playersArray;
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
    
    public boolean hasWinner() {
        int finalHouseId = this.houses.size() - 1;
        for (Player p : getPlayers()) {
            if(getPlayerHouseId(p) == finalHouseId) {
                return true;
            }
        }
        return false;
    }
    
    public Player getWinner() {
        if(hasWinner()) {
            int finalHouseId = this.houses.size() - 1;
            for (Player p : getPlayers()) {
                if(getPlayerHouseId(p) == finalHouseId) {
                    return p;
                }
            }
        }
        return null;
    }
}
