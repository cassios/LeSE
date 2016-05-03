/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.board.Player;
import br.game.reuse.lese.presenters.interfaces.BoardPresenter;
import java.io.IOException;

/**
 *
 * @author marlon
 */
public class ConsoleBoardPresenter implements BoardPresenter {

    
    ///TODO - getPlayerChoice option
    //Player may choose to register a net question for example
    
    @Override
    public void showStartScreen() throws IOException {
        System.out.println("Welcome to LeSe (Learning Software Engineering)!");
        System.out.println("This is a board game that will teach you about the processes involved in Software Engineering.");
        System.out.println("We will take you through all phases of the development life cycle, following an iterative and "
                + "incremental approach.");
        System.out.println("The goal of this game is simple: to reach the end of the board (the final house). "
                + "But it won't be that easy...");
        System.out.println("Each house will hold a question, and you're only going forward if you get them right!");
        System.out.println("A house may also hold a surprise, which can be good or bad, just like real software engineering!");
        System.out.println("Hope you got it! Press any key to continue...");
        System.in.read();
    }

    @Override
    public void showSetUpScreen() {
        System.out.println("It's time to set up the game! We'll walk you through the process of choosing a project "
                + "and the number of players!");
    }

    @Override
    public int getNumPlayers() throws IOException {
        System.out.println("How many players will be playing this game?");
        return System.in.read();
    }

    @Override
    public void showWinner(Player player) {
        System.out.println("Match is over!");
        System.out.println("Congratulations to player " + player.getNickname() + "!. He is our champion!");
    }
    
}
