/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.presenters.consolepresenters;

import br.game.reuse.lese.model.Player;
import br.game.reuse.lese.model.dao.PlayerDAO;
import br.game.reuse.lese.presenters.interfaces.GamePresenter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ConsoleGamePresenter implements GamePresenter {

    @Override
    public int menu() {
        System.out.println("\nMenu Principal:");
        System.out.println("1 - Jogar");
        System.out.println("2 - Acessar Ranking");
        System.out.println("3 - Ajuda");
        System.out.println("4 - Exit\n");
        System.out.println("Escolha a opção: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    @Override
    public void showRanking() {
        List<Player> players = new PlayerDAO().ranking();
        System.out.println("--------------------Ranking----------------------\n");
        if (!players.isEmpty()) {
            int position = 1;
            for (Player p : players) {
                System.out.println(position + " - " + p.getName() + " -------------------- " + p.getScore());
                position++;
            }
        }else{
            System.out.println("Ranking vazio.");
        }
    }

    @Override
    public void showHelp() {
        System.out.println("HELP");
    }

    @Override
    public void showExit() {
        System.out.println("Obrigado por ter participado do jogo! Esperamos que tenha gostado.\nAté breve!");
    }

    @Override
    public void showDefault() {
        System.out.println("Opção inexistente! Escolha novamente.");
    }

    @Override
    public void welcome() {
        System.out.println("Seja Bem Vindo ao LeSE!");
    }

}
