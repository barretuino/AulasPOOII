package pjAula6;

/**
 * Classe Abstrata - Defini��o de uma classe 'Gen�rica'	
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public abstract class OperacaoMatematica {
	//Atributos
	float resultado;
	
	//M�todo comum
	public void imprimir() {
		System.out.println("O resultado � " + resultado);
	}
	
	//M�todo Abstrato
	public abstract float calcular(float a, float b);
}