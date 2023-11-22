
package DAO;

import ecoleta.Main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Conexao;



        
        
        
        
public class CidadeDAO {
    
    
     public static String buscarNome(String nome) {

        String sql = "SELECT * FROM ecoleta WHERE nome = ?";
        try (PreparedStatement stm = Conexao.getConexao().prepareStatement(sql)) {
            stm.setString(1, nome);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                nome = rs.getString("nome");

                return Main.nomeGlobal = nome;

            }

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

        return null;

    }

}

    
    
    
    
    
    
    
    
    
    
    
    

