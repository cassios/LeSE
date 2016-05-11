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
            ps = connection.prepareStatement("INSERT INTO question(phase, description, explanation, score, house) VALUES(?, ?, ?, ?, ?)");
            ps.setInt(1, question.getPhase().getIdPhase());
            ps.setString(2, question.getDescription());
            ps.setString(3, question.getExplanation());
            ps.setInt(4, question.getScore());
            ps.setInt(5, question.getHouse());
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
