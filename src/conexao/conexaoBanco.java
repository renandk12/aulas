/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Big Bear
 */
public class conexaoBanco {
    
    Connection con;
    Statement stmt;
    
    String url = "jdbc:mysql://localhost/db_construtora";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String pass = "";
    
    public void abrirConexar(){
        try {
            Class.forName(driver);
      con = DriverManager.getConnection(url, user, pass);
      stmt = con.createStatement();
        } catch (Exception e) {
        }
      }
    /**
    public static void main(String[] args) {
        conexaoBanco conexao = new conexaoBanco();
        conexao.abrirConexar();
    }*/
    
}
