package pjAula6;

/**
 * Classe Abstrata - Definição de uma classe 'Genérica'	
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public abstract class OperacaoMatematica {
	//Atributos
	float resultado;
	
	//Método comum
	public void imprimir() {
		System.out.println("O resultado é " + resultado);
	}
	
	//Método Abstrato
	public abstract float calcular(float a, float b);
}