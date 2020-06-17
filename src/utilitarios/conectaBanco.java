package utilitarios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class conectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.sqlite.JDBC";
    private String caminho = "jdbc:sqlite:C:\\Users\\Cerogabgiohel\\Downloads\\SQLiteDatabaseBrowserPortable\\Data\\patrimonios.db";
    public Connection conn;
    
   public void conexao(){      
        try {
             System.setProperty("jdbc.Drivers",driver);
            conn = DriverManager.getConnection(caminho);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão\n Erro: "+ex.getMessage());
            
        }
       
   }
   
   public void desconeta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão\n Erro: "+ex.getMessage());
        }
   }
    
}
