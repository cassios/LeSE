/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.reuse.lese.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class DBConnection {

    private static final String host = "jdbc:mysql://localhost:3306/lese";
    private static final String user = "lese";
    private static final String password = "l3s3";

    public static Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(host, user, password);
        } catch (ClassNotFoundException ex) {
            String errorMessage = "Driver não encontrado!";
            throw new ClassNotFoundException(errorMessage, ex);
        } catch (SQLException ex) {
            String errorMessage = "Erro ao estabelecer conexão!";
            throw new ClassNotFoundException(errorMessage, ex);
        }
        return connection;
    }

    public static final void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível fechar a conexão!" + e.getCause());
        }
    }

    public static final void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível fechar a conexão!" + e.getCause());
        }
        closeConnection(connection);
    }

    public static final void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível fechar a conexão!" + e.getCause());
        }
        closeConnection(connection, statement);
    }

}
