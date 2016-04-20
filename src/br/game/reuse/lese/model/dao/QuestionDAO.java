/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model.dao;

import br.game.reuse.lese.connection.DBConnection;
import br.game.reuse.lese.model.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class QuestionDAO {
    
    public static int createQuestion(Question question){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO question(phase, project, cycle, text, explication, score) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, question.getPhase().getCode());
            ps.setInt(2, question.getProject().getCode());
            ps.setInt(3, question.getCycle());
            ps.setString(4, question.getText());
            ps.setString(5, question.getExplication());
            ps.setInt(6, question.getScore());
            return ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBConnection.closeConnection(connection, ps);
        }
        return 0;
    }
    
}
