/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.view;

import br.game.reuse.lese.model.Student;
import br.game.reuse.lese.view.interfaces.AbstractComponent;

/**
 *
 * @author bruno
 */
public class BoardView {

    private Student student = null;
    
    public BoardView(String nameStudent){
        this.student = new Student(nameStudent);
    }
    
    public static void main(String[] args) {
        AbstractComponent component = new ComponentHouseView();
        component.addComponent(component);
        AbstractComponent component2 = new ComponentScoreboardView();
        component2.addComponent(component);
        AbstractComponent component3 = new ComponentDiceView();
        component3.addComponent(component);
//        AbstractComponent component4 = new ComponentWalkerView();
//        component.positionX = 5;
//        component4.addComponent(component);
        component.setSize(1000, 700);
        component.setVisible(true);
        component.setResizable(false);
    }
    
    public void createStudent(){
        
    }

}
