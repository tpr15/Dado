package jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JogoDAO {
	private Connection con = null;
    
    public JogoDAO() throws Exception{
        this.con = ConnectionBD.getConnection();
    }
    
    public int maxId() throws SQLException , Exception {
		PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT MAX(jogo.id) as lastId FROM jogo";

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("lastId");
            }

        } finally {
            ConnectionBD.closeConnection(con, stmt, rs);
        }
        
        return 0;
	}
    
    public void createGame(int quantidadeJogadores , int rodada) throws SQLException{
        
        PreparedStatement state = null;
        String sql = "INSERT INTO jogo (quantidadeJogadores , rodada) VALUES (?,?)";
        
        try {
            state = con.prepareStatement(sql);
            state.setInt(1, quantidadeJogadores);
            state.setInt(2, rodada);
            state.executeUpdate();
        }finally{
            ConnectionBD.closeConnection(con, state);
        } 
    }
    
    public void updateGame(int gameId, int quantidadeJogadores , int rodada) throws SQLException , Exception {

		PreparedStatement state = null;
		String sql = "UPDATE jogo SET quantidadeJogadores = ? , rodada = ? WHERE id = ?";

		try {
			state = con.prepareStatement(sql);
            state.setInt(1, quantidadeJogadores);
            state.setInt(2, rodada);
			state.setInt(3, gameId);
			state.executeUpdate();
		} finally {
			ConnectionBD.closeConnection(con, state);
		}
	}
    
    public int carregaRodada(int gameId) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT rodada FROM jogo WHERE jogo.id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, gameId);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("rodada");
            }
        }finally {
            ConnectionBD.closeConnection(con, stmt, rs);
        }
        return 0;
    }
    
    public boolean isExist(int gameId) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT id FROM jogo WHERE jogo.id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, gameId);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }else{
            	return false;
            }
        }finally {
            ConnectionBD.closeConnection(con, stmt, rs);
        }
    }
}
