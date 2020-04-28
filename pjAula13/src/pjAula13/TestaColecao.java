package pjAula13;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para Experimentação de 
 * 		Construção
 * 		Escrita
 * 		Leitura
 * 		Manutenção de coleções
 * @author Paulo Barreto
 * @data 27/04/2020
 */

public class TestaColecao {
	public static void main(String[] args) {
		//Declaração de uma List não identificada
		List lista = new ArrayList();
		
		Produto produto = new Produto();
		produto.setCodigo(753);
		produto.setDescricao("Lapis de Cor");
		
		//Adição na lista
		lista.add(produto);
		
		Produto produto2 = new Produto();
		produto2.setCodigo(159);
		produto2.setDescricao("Papel Sulfite A4");
		
		lista.add(produto2);
		lista.add("Carol");
		lista.add("George");
		lista.add("Matheus");
		lista.add("André");
		lista.add("Samuel");
		lista.add("Bruna");
		lista.add(159);
		lista.add(true);
		
		System.out.println(lista);	
		System.out.println(lista.size());
		
		lista.remove("George");
		System.out.println(lista);
		System.out.println(lista.size());
		
		for(Object o : lista) {
			if(o instanceof Produto) {
				Produto p = (Produto)o;
				System.out.println(p.getCodigo() + " - " + p.getDescricao());
			}
			if(o instanceof Integer) {
				System.out.println(String.valueOf(o));
			}
			if(o instanceof Boolean) {
				System.out.println((Boolean)o ? "Ativo" : "Inativo");
			}
			if(o instanceof String) {
				System.out.println(o);
			}
		}
		
	}
}
