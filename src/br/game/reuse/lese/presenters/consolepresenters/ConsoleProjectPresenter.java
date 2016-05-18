/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.board.Board;
import br.game.reuse.lese.presenters.interfaces.ProjectPresenter;

/**
 *
 * @author marlon
 */
public class ConsoleProjectPresenter implements ProjectPresenter {

    @Override
    public void showProjects() {
        Board board = Board.getInstance();
        System.out.println(board.getProjectBoard().getName() + "\n" + board.getProjectBoard().getDescription() + "\nNúmero de ciclos: " + board.getProjectBoard().getCycle());
    }
    
}
