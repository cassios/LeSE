/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model.dao;

import br.game.reuse.lese.board.PlayerBoard;
import br.game.reuse.lese.connection.DBConnection;
import br.game.reuse.lese.model.Player;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class PlayerDAO {
    
    public static int createPlayer(Player player){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO player(user, score) VALUES(?, ?)");
            ps.setInt(1, player.getIdUser());
            ps.setInt(2, player.getScore());
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
    
    public static int createPlayer(PlayerBoard player){
        int idUser = new UserDAO().createUser(player);
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO player(user, score) VALUES(?, ?)");
            ps.setInt(1, idUser);
            ps.setInt(2, player.getCurrentScore());
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
    
    public List<Player> ranking(){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("SELECT * FROM player p, user u WHERE p.user=u.id_user ORDER BY p.score DESC");
            ResultSet rs = ps.executeQuery();
            List<Player> ranking = new ArrayList<>();
            while(rs.next()){
                Player p = new Player();
                p.setIdPlayer(rs.getInt("id_player"));
                p.setIdUser(rs.getInt("user"));
                p.setName(rs.getString("name"));
                p.setScore(rs.getInt("score"));
                ranking.add(p);
            }
            return ranking;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBConnection.closeConnection(connection, ps);
        }
        return null;
    }
    
}
