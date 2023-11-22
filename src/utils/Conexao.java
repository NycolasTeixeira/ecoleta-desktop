/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nycolas_teixeira
 */
public class Conexao {
    
    public static Connection getConexao(){
        
        try {
             return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecoleta", "postgres", "senai");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("problema ao conectar");
        
        }
        
        
        
        return null;
        
    }
    
    
    
}
