package pjAula13;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista Identificada
 * 	List <tipo> 
 * @author Paulo Barreto
 * @date 27/04/2020
 */

public class ListaIdentificada {
	public static void main(String[] args) {
		//Lista identificada
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		System.out.println(listaProdutos.isEmpty());
		
		Produto produto = new Produto();
		produto.setCodigo(753);
		produto.setDescricao("Lapis de Cor");
				
		Produto produto2 = new Produto();
		produto2.setCodigo(159);
		produto2.setDescricao("Papel Sulfite A4");
		
		//1ª Adição
		listaProdutos.add(produto);
		listaProdutos.add(produto2);
		
		//2ª Listagem
		System.out.println(listaProdutos); //Imprimi o toString();		
		for(Produto p : listaProdutos) {
			System.out.println(p);
		}		
		//ou
		listaProdutos.forEach(p-> System.out.println(p));
		
		//3ª Remoção
		List<Produto> listaRejeitos = new ArrayList<Produto>();
		listaRejeitos.add(produto);
		
		System.out.println(listaRejeitos);
		listaProdutos.removeAll(listaRejeitos);
		System.out.println(listaProdutos);
		
		listaProdutos.remove(produto);
		
		//4ª Adição em Massa
		listaProdutos.addAll(listaRejeitos);
	}
}
