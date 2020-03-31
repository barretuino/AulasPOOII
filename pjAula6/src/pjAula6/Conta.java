package pjAula6;

/**
 * Exemplo de Implementação Sobrecarga de Construtores de Tipos de Classes
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public class Conta {
	public static float mostrarCalculo(OperacaoMatematica operacao, float a, float b) {
		return operacao.calcular(a, b);
	}
	
	public static void main(String[] args) {
		System.out.println(Conta.mostrarCalculo(new Soma(), 14, 15));
		System.out.println(Conta.mostrarCalculo(new Subtracao(), 14, 15));
		System.out.println(Conta.mostrarCalculo(new Divisao(), 40, 20));
		System.out.println(Conta.mostrarCalculo(new Multiplicacao(), 3, 10));
	}
}
