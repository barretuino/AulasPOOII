package br.barretuino.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.barretuino.modelagem.Cliente;

/**
 * Classe de Acesso ao Banco de Dados
 * CRUD - Create, Read, Update e Delete
 * @author Paulo Barreto
 * @data 23/11/2019
 */
public class ClienteDao {
	//1� Passo - Estabelecer uma Conex�o
	private Connection connection;
	public ClienteDao() throws SQLException{
		connection = ConnectionFactory.getConnection();
	}
	
	//2� Passo - A��o de Inser��o de Dados
	public void adicionar(Cliente cliente) throws SQLException{
		//Instru��o de Inser��o (Comando SQL)
		PreparedStatement stmt = this.connection.prepareStatement(
		   "insert into clientes (cpf, nome, endRua, endNum, endBairro, endCidade, "
			+ "endUF, endComplemento, sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		try {
			stmt.setDouble(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEndRua());
			stmt.setInt(4, cliente.getEndNum());
			stmt.setString(5, cliente.getEndBairro());
			stmt.setString(6, cliente.getEndCidade());
			stmt.setString(7, cliente.getEndUF());
			stmt.setString(8, cliente.getEndComplemento());
			stmt.setString(9, cliente.getSexo());
			
			//Execu��o no Banco
			stmt.execute();
			System.out.println("Cliente Inserido com Sucesso!");
		}catch(SQLException e) {
			System.out.println("Falha ao inserir " + e);
		}finally {
			stmt.close();
		}
	}
	
	//M�todo de Exclus�o
		public void excluir(Double cpf) throws SQLException {
			//prepared statement para inser��o
			PreparedStatement stmt = this.connection.prepareStatement(
					"DELETE FROM `clientes` where `cpf` = ?");
			try{
				// seta os valores
				stmt.setDouble(1,cpf);		
				// executa stmt (Query)
				stmt.execute();
			} catch (SQLException ex) {
				System.out.println("Erro ao excluir " + ex);
				ex.printStackTrace();
			} finally {
				stmt.close();
				System.out.println("Excluido: " + cpf);
			}	
		}

		//M�todo de Pesquisa
		public Cliente pesquisar(Double codigo) throws SQLException {
			//cria o objeto
			Cliente clienteRet = new Cliente();
			// prepared statement para inser��o
			PreparedStatement stmt = this.connection.prepareStatement(
					"SELECT * FROM `clientes` where `cpf` = ?");
			try {
				// seta os valores			
				stmt.setDouble(1,codigo);		
				// executa stmt (Query)			
				ResultSet rs = stmt.executeQuery();		
				while (rs.next()) {                
					// seta os valores dos campos do objeto
					clienteRet.setCpf(rs.getDouble(1));
					clienteRet.setNome(rs.getString(2));
					clienteRet.setEndRua(rs.getString(3));
					clienteRet.setEndNum(rs.getInt(4));
					clienteRet.setEndBairro(rs.getString(5));
					clienteRet.setEndCidade(rs.getString(6));
					clienteRet.setEndUF(rs.getString(7));
					clienteRet.setSexo(rs.getString(8));
					clienteRet.setEndComplemento(rs.getString(9));                
				}

			} catch (SQLException ex) {
				System.out.println("Erro ao consultar " + ex);
				ex.printStackTrace();
			} finally {
				stmt.close();
				System.out.println("Pesquisa realizada.");
			}
			return clienteRet;    
		}

		//M�todo de Atualiza��o
		public void atualizar(Cliente cliente) throws SQLException {
			// prepared statement para inser��o
			PreparedStatement stmt = this.connection.prepareStatement(
					"UPDATE clientes SET " +
					"nome = '" + cliente.getNome() + "', " +
					"endRua = '" + cliente.getEndRua()+ "', " +
					"endNum = " + cliente.getEndNum() + ", " +
					"endBairro = '" + cliente.getEndBairro() + "', " +
					"endCidade = '" + cliente.getEndCidade() + "', " +
					"endUF = '" + cliente.getEndUF() + "', " +
					"endComplemento = '" + cliente.getEndComplemento() + "', " +
					"sexo = '" + cliente.getSexo() + "'" + 
					" WHERE cpf = " + cliente.getCpf());
			try {            

				System.out.println(stmt.toString());

				// executa stmt (Query)			
				stmt.executeUpdate();
				System.out.println("Alterado Cliente: " + cliente.getCpf());	        
			} catch (SQLException ex) {
				System.out.println("Erro ao atualizar cliente " + ex);
				ex.printStackTrace();
			} finally {
				stmt.close();			
			}        
		}
}
