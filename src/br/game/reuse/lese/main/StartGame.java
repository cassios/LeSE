/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.main;

import br.game.reuse.lese.board.Board;
import br.game.reuse.lese.board.BoardBuilder;
import br.game.reuse.lese.board.Player;
import br.game.reuse.lese.house.House;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public final class StartGame {
    
    private Board board;
    private final boolean finish = false;
    
    public StartGame(){
        initializeGame();
    }
    
    public void initializeGame(){
        BoardBuilder boarderBuilder = new BoardBuilder();
        boarderBuilder.buildBoard();
        this.board = Board.getInstance();
        definePlayers();
        play();
//        System.out.print(board.getPlayers().get(0));
    }
    
    public void definePlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String namePlayer = scanner.nextLine();
        this.board.addPlayer(namePlayer, "black");
    }
    
    public void play(){
        while(!finish){
            for(Player p: this.board.getPlayers()){
                House housePosition = p.getPawnPosition();
            }
        }
    }
    
}
