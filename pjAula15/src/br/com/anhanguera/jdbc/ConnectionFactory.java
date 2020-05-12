package br.com.anhanguera.jdbc;

import java.sql.Connection; //Conex�o pr�priamente dita
import java.sql.DriverManager; //Gerenciador do Driver
import java.sql.SQLException; //Tratamento de Exce��o

/**
 * F�brica de Conex�es
 * @author Paulo Barreto
 * @data 11/05/2020
 * Projeto de Cadastro de Clientes
 */

public class ConnectionFactory {
	public static Connection getConnection() 
			throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return
					DriverManager.getConnection(
							"jdbc:mysql://localhost/computacao",
							"root","admin");
		}catch(ClassNotFoundException erro){
			throw new SQLException(erro.getMessage());
		}
	}
}