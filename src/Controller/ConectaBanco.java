package Controller;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Engenheiro de Sistemas William Nascimento
 */
public class ConectaBanco {
    public Statement stm ;
    public ResultSet rs ;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5433/bd_controlecomercial";
    private String usuario = "postgres";
    private String senha = "@mmde0566ev";
    public Connection conn;

    public void conexaoComBancoDados() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar com o"
                    + " banco de Dados!verifique a conexão...\n" + ex.getMessage());
        }
    }

      
  
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar-se do Banco de Dados...\n"
                    + ex.getMessage());
        }
    }
}
