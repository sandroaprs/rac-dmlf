package br.gov.ipem.racdmlf.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
*
* @author Sandro Souza
*/
public class Conexao {
    
    private Connection con;
    private java.sql.Statement st;

    public Connection getCon() {
        return con;
    }

    public Statement getSt() {
        return st;
    }
       
    public Statement conectar() {

        try {
            //Class.forName("com.mysql.jdbc.Driver");
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/racxml?useTimezone=true&serverTimezone=UTC", "sandro", "1234");
            st = con.createStatement();
           // String q = "SELECT * FROM afericaoequipamento WHERE data  BETWEEN ('2019-05-01') AND ('2019-10-13')";
     
            return st;
            
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
            ex.printStackTrace();
            return null;
 
        } catch (Exception ex1) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
            ex1.printStackTrace();
            return null;
           
        }

    }

    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }
}
