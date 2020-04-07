package pjAula7;

/**
 * Definição da classe Forma Abstrata
 * Uma classe abstrata
 * @author Paulo Barreto
 * @data 06/04/2020
 */

public abstract class FormaAbstrata {
	int vetor[]; 
	
	public FormaAbstrata(int numeroPontos) {
		vetor = new int[numeroPontos];
	}
	
	//Declaração de um método abstrato
	//Exigir da subClasse uma implementação de corpo
	public abstract float calcularArea();
	
	//public abstract String imprimir();
}