package jogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ConnectionBD {
	
    private static final String BDA = "JogoWar"; 
    private static final String IP = "127.0.0.1";
    private static final String PORTA = "3306";
    private static final String URL = "jdbc:mysql://" + IP + ":" + PORTA + "/" + BDA;
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() throws Exception {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new Exception("Erro na conex�o: ", ex);
        }
    }

    public static void closeConnection(Connection con) throws SQLException {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) throws SQLException {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
        	throw ex;
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
        	throw ex;
        }
    }

}
