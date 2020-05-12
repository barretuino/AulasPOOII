package br.com.anhanguera.test;

import java.sql.SQLException;
import java.util.List;

import br.com.anhanguera.jdbc.ClienteDAO;
import br.com.anhanguera.modelagem.Cliente;

/**
 * Classe de Teste para o Projeto
 * @author Paulo Barreto
 * @11/05/2020
 * Projeto de Cadastro de Clientes
 */

public class Teste {
	public static void main(String[] args) {
		/*try {
			Connection conn = ConnectionFactory.getConnection();
			System.out.println("Conexão Realizada com Sucesso");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		Cliente cliente = new Cliente();
		
		cliente.setCpf(298778665);
		cliente.setNome("George");
		cliente.setEndRua("Av. Monte");
		cliente.setEndNum(1000);
		cliente.setEndBairro("Zumbi");
		cliente.setEndCidade("Sta. Bárbara D Oeste");
		cliente.setEndUF("SP");
		cliente.setEndComplemento("Bloco 3/5 - Apto 171");
		cliente.setSexo("M");
		
		ClienteDAO dao;
		try {
			dao = new ClienteDAO();
			
			//Adição
			//dao.adicionar(cliente);
			
			//Exclusão
			//dao.excluir((double) 298778665);
			
			//Atualização
			dao.atualizar(cliente);
			
			//Pesquisa
			Cliente retorno = dao.pesquisar((double) 298778665);
			System.out.println(retorno.getNome());
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}