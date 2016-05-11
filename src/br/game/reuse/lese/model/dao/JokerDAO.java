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
            ps = connection.prepareStatement("INSERT INTO joker(phase, title, description, action, score, house) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, joker.getPhase().getIdPhase());
            ps.setString(2, joker.getTitle());
            ps.setString(3, joker.getDescription());
            ps.setString(4, joker.getAction());
            ps.setInt(5, joker.getScore());
            ps.setInt(6, joker.getHouse());
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
