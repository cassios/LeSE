/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleBoardPresenter;
import br.game.reuse.lese.presenters.consolepresenters.ConsolePlayerPresenter;
import br.game.reuse.lese.presenters.interfaces.BoardPresenter;
import br.game.reuse.lese.presenters.interfaces.PlayerPresenter;

/**
 *
 * @author cass
 */
public class BoardGame {
    private Board board;
    
    
    public void creatBoard(BoardBuilder builder) {
        
        builder.buildBoard();
        builder.buildProject();
        builder.buildHouses();
    }
    
    public void setUpGame() {
        PlayerPresenter playerPresenter = new ConsolePlayerPresenter();
        int nPlayers = playerPresenter.showPlayerSetUp();        
        for (int i = 1; i <= nPlayers; i++) {
            String playerName = playerPresenter.getPlayerName(i);
            this.board.addPlayer(playerName, "red");
        }
    }
    
    public void init(){
        creatBoard(new BoardBuilder());
        this.board = Board.getInstance();
        setUpGame();
        run();
    }
    
    public void run() {
        PlayerBoard winner = null;
        
        while(winner == null) {
            for (PlayerBoard p : this.board.getPlayers()) {
               House playerHouse = this.board.getPlayerHouse(p);
               playerHouse.execute(p);
               
               if(this.board.hasWinner()) {
                   winner = this.board.getWinner();
                   break;
               }
            }
        }
        
        //TODO(MM) : this if is unnecessary 
        if(winner != null) {
            BoardPresenter boarPresenter = new ConsoleBoardPresenter();
            boarPresenter.showWinner(winner);
        }
    }    
}
