package br.gov.ipem.racdmlf.dao;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

/**
 *
 * @author Sandro Souza
 */

public class ConexaoMysql {
	    
    public static void main (String args[]){
        ConexaoMysql.getConexaoMySQL();
        System.out.println(ConexaoMysql.statusConection());
    }
	    
   public static String status = "Não conectou ao Servidor...";
	 
	//Método Construtor da Classe//
	 
	        public ConexaoMysql() {
	 
	    }
	 
	  
	 
	//Método de Conexão//
	 
	public static java.sql.Connection getConexaoMySQL() {
	 
	        Connection connection = null;          //atributo do tipo Connection
	 
	  
	 
	try {
	 
	// Carregando o JDBC Driver padrão
	 
	// String driverName = "com.mysql.jdbc.Driver"; 
	String driverName = "com.mysql.cj.jdbc.Driver";  // Mysql Server 8.0 
	 
	Class.forName(driverName);
	 
	  
	 
	// Configurando a nossa conexão com um banco de dados//
	 
	            String serverName = "localhost:3306";    //caminho do servidor do BD
	            
	           // String mydatabase ="ipem"; 
	            String mydatabase ="produtividade";        //nome do seu banco de dados
	 
	            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	 
	            String username = "sandro";        //nome de um usuário de seu BD      
	 
	            String password = "2275";      //sua senha de acesso
	 
	            //connection = DriverManager.getConnection(url, username, password);
	            connection = DriverManager.getConnection(url + "?useSSL=false&serverTimezone=UTC", username, password);
	            // jdbc:mysql://localhost:3306/produtividade?useSSL=false&serverTimezone=UTC
	  
	 
	            //Testa sua conexão//  
	 
	            if (connection != null) {
	 
	                status = ("Status Atual: Conectado com sucesso!");
	 
	            } else {
	 
	                status = ("Stats Atual:  Não foi possivel realizar conexão");
	 
	            }
	 
	  
	 
	            return connection;
	 
	  
	 
	        } catch (ClassNotFoundException e) {  //Driver não encontrado
	 
	  
	 
	            System.out.println("O driver expecificado nao foi encontrado.");
	 
	            return null;
	 
	        } catch (SQLException e) {
	 
	//Não conseguindo se conectar ao banco
	 
	            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	 
	            return null;
	 
	        }
	 
	  
	 
	    }
	 
	  
	 
	    //Método que retorna o status da sua conexão//
	 
	    public static String statusConection() {
	 
	        return status;
	 
	    }
	 
	   
	 
	   //Método que fecha sua conexão//
	 
	    public static boolean FecharConexao() {
	 
	        try {
	 
	            ConexaoMysql.getConexaoMySQL().close();
	            System.out.println(status);
	 
	            return true;
	 
	        } catch (SQLException e) {
	 
	            return false;
	 
	        }
	 
	  
	 
	    }
	 
	   
	 
	   //Método que reinicia sua conexão//
	 
	    public static java.sql.Connection ReiniciarConexao() {
	 
	        FecharConexao();
	 
	  
	 
	        return ConexaoMysql.getConexaoMySQL();
	 
	    }
	    
	    
	   
	
	
}
