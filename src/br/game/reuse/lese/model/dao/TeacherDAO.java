/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.model.dao;

import br.game.reuse.lese.connection.DBConnection;
import br.game.reuse.lese.model.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class TeacherDAO {
    
    public static int createTeacher(Teacher teacher){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO teacher(cpf, user, institution, email, password) VALUES(?, ?, ?, ?, ?)");
            ps.setString(1, teacher.getCpf());
            ps.setInt(2, teacher.getIdUser());
            ps.setString(3, teacher.getInstitution());
            ps.setString(4, teacher.getEmail());
            ps.setString(5, teacher.getPassword());
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
