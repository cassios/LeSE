/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model.dao;

import br.game.reuse.lese.connection.DBConnection;
import br.game.reuse.lese.model.Joker;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class JokerDAO {
    
    public static int createJoker(Joker joker){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO joker(phase, project, cycle, title, text, action, score, house) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, joker.getPhase().getCode());
            ps.setInt(2, joker.getProject().getCode());
            ps.setInt(3, joker.getCycle());
            ps.setString(4, joker.getTitle());
            ps.setString(5, joker.getText());
            ps.setString(6, joker.getAction());
            ps.setInt(7, joker.getScore());
            ps.setInt(8, joker.getHouse());
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
