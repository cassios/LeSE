/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.model.dao.PlayerDAO;
import br.game.reuse.lese.question.ProjectBoard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author cass
 */
public class Board {
    private static Board instance;
    private ArrayList<House> houses;
    private HashMap<PlayerBoard, PlayerBoard> players;
    private ProjectBoard project;
    
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
        PlayerBoard newPlayer = new PlayerBoard(nickname);
        this.players.put(newPlayer, newPlayer);
    }
    
    public ArrayList<PlayerBoard> getPlayers() {
        ArrayList<PlayerBoard> playersArray = new ArrayList<>();
        for (Entry<PlayerBoard, PlayerBoard> item : this.players.entrySet()) {
            playersArray.add(item.getKey());
        }
        return playersArray;
    }
    
    private int getPlayerHouseId(PlayerBoard p) {
        return this.players.get(p).getCurrentPos();
    }
        
    public House getPlayerHouse(PlayerBoard p) {
        return getHouseAtIndex(getPlayerHouseId(p));
    }
    
    public void storePlayers(){
        for(Entry<PlayerBoard, PlayerBoard> item : this.players.entrySet()){
            PlayerBoard player = item.getValue();
            new PlayerDAO().createPlayer(player);
        }
    }
    
    public boolean hasWinner() {
        int finalHouseId = this.houses.size() - 1;
        for (PlayerBoard p : getPlayers()) {
            if(getPlayerHouseId(p) == finalHouseId) {
                return true;
            }
        }
        return false;
    }
    
    public PlayerBoard getWinner() {
        if(hasWinner()) {
            int finalHouseId = this.houses.size() - 1;
            for (PlayerBoard p : getPlayers()) {
                if(getPlayerHouseId(p) == finalHouseId) {
                    return p;
                }
            }
        }
        return null;
    }
    
    public void createProjectBoard(String name, String description, int cycle){
        this.project = new ProjectBoard(name, description, cycle);
    }
    
    public ProjectBoard getProjectBoard(){
        return this.project;
    }
}
