package pjAula6;

/**
 * Classe de Modelagem Conceitual 
 * Uso de Sobrecarga de M�todos (Polimorfismo)
 * @author Paulo Barreto
 *
 */

public class Cliente {
	int id;
	String nome;
	
	//M�todos Construtores
	public Cliente() {
		//inicializa��o dos atributos com valores default
	}
	
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
		
		System.out.println("Teste");
	}
}
