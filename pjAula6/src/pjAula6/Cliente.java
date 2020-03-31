package pjAula6;

/**
 * Classe de Modelagem Conceitual 
 * Uso de Sobrecarga de Métodos (Polimorfismo)
 * @author Paulo Barreto
 *
 */

public class Cliente {
	int id;
	String nome;
	
	//Métodos Construtores
	public Cliente() {
		//inicialização dos atributos com valores default
	}
	
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
		
		System.out.println("Teste");
	}
}
