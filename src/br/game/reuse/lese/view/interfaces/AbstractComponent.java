/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view.interfaces;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author bruno
 */
public abstract class AbstractComponent extends JFrame implements ActionListener{

    public Container container;
    public int score;
    private int positionX;
    private int positionY;
    private int positionXOld;
    private int positionYOld;
    public int code;

    public AbstractComponent() {
        if (this.container == null) {
            this.container = new Container();
            this.score = 0;
            this.positionX = 10;
            this.positionY = 10;
            this.positionXOld = 10;
            this.positionYOld = 10;
            this.code = 0;
        }
    }

    public void addComponent(AbstractComponent component) {
        //this method add the components on the board.
    }

    public void setNewPosition(int newPositionX, int newPositionY){
        this.positionXOld = this.positionX;
        this.positionYOld = this.positionY;
        this.positionX = newPositionX;
        this.positionY = newPositionY;
    }
    
}
