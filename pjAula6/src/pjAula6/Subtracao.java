package pjAula6;

/**
 * Exemplo de Implementa��o / Instancia��o de uma Classe Abstrata
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public class Subtracao extends OperacaoMatematica {
	@Override
	public float calcular(float a, float b) {
		return a - b;
	}
}