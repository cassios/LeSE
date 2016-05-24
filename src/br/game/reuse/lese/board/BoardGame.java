/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.board;

import br.game.reuse.lese.house.House;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleBoardPresenter;
import br.game.reuse.lese.presenters.consolepresenters.ConsoleGamePresenter;
import br.game.reuse.lese.presenters.consolepresenters.ConsolePlayerPresenter;
import br.game.reuse.lese.presenters.interfaces.BoardPresenter;
import br.game.reuse.lese.presenters.interfaces.GamePresenter;
import br.game.reuse.lese.presenters.interfaces.PlayerPresenter;

/**
 *
 * @author cass
 */
public class BoardGame {

    private Board board;
    private BoardPresenter boardPresenter;
    private GamePresenter gamePresenter;
    private PlayerPresenter playerPresenter;

    public void creatBoard(BoardBuilder builder) {

        builder.buildBoard();
        builder.buildProject();
        builder.buildHouses();
    }

    public void setUpGame() {
        playerPresenter = new ConsolePlayerPresenter();

        String playerName = playerPresenter.getPlayerName();
        this.board.addPlayer(playerName, "red");
        GamePresenter gamePresenter = new ConsoleGamePresenter();
        gamePresenter.cleanConsole();
    }

    public void init() {
        creatBoard(new BoardBuilder());
        this.board = Board.getInstance();
        gamePresenter = new ConsoleGamePresenter();
        gamePresenter.welcome();
        int opcao = 0;
        do {
            opcao = gamePresenter.menu();
            switch (opcao) {
                case 1:
                    setUpGame();
                    run();
                    break;
                case 2:
                    gamePresenter.showRanking();
                    break;
                case 3:
                    gamePresenter.showHelp();
                    break;
                case 4:
                    gamePresenter.showExit();
                    break;
                default:
                    gamePresenter.showDefault();
                    break;
            }
        } while (opcao != 4);
    }

    public void run() {
        PlayerBoard winner = null;
        boardPresenter = new ConsoleBoardPresenter();
        boolean continueGame = true;

        while (winner == null && continueGame) {
            for (PlayerBoard p : this.board.getPlayers()) {
                House playerHouse = this.board.getPlayerHouse(p);
                playerHouse.execute(p);
                GamePresenter gamePresenter = new ConsoleGamePresenter();
                continueGame = gamePresenter.continueGame();

                if (this.board.hasWinner()) {
                    winner = this.board.getWinner();
                    this.board.storePlayers();
                    boardPresenter.showWinner(winner);
                    break;
                }else if(!continueGame){
                    boardPresenter.finalizeGame();
                }
            }
        }

    }
}
