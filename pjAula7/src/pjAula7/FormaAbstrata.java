package pjAula7;

/**
 * Defini��o da classe Forma Abstrata
 * Uma classe abstrata
 * @author Paulo Barreto
 * @data 06/04/2020
 */

public abstract class FormaAbstrata {
	int vetor[]; 
	
	public FormaAbstrata(int numeroPontos) {
		vetor = new int[numeroPontos];
	}
	
	//Declara��o de um m�todo abstrato
	//Exigir da subClasse uma implementa��o de corpo
	public abstract float calcularArea();
	
	//public abstract String imprimir();
}