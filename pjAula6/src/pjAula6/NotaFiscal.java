package pjAula6;

/**
 * Exemplo adendo de atributos estáticos
 * @author Paulo Barreto
 * @date 30/03/2020
 */

public class NotaFiscal {
	private static int sequencial;
	private int numero;
	
	public int getSequencial() {
		return ++sequencial;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
