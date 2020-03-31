package pjAula6;

/**
 * Exemplo de Polimorfismo entre Classes Pai / Filho
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public class Mosca extends Inseto {
	//Sobrecarga do Método de Movimentar
	public void movimentar(float distanciaX, String distanciaY) {
		setDistanciaPercorrida(distanciaX *  Integer.parseInt(distanciaY));
	}	
	public void movimentar(String distanciaX, float distanciaY) {
		setDistanciaPercorrida(Integer.parseInt(distanciaX) *  distanciaY);
	}
	public void movimentar(String distanciaX, String distanciaY) {
		setDistanciaPercorrida(Integer.parseInt(distanciaX) *  Integer.parseInt(distanciaY));
	}
	
	public static void main(String[] args) {
		Mosca m1 = new Mosca();
		
		m1.movimentar(10, 14);
		m1.movimentar(10, "14");
		m1.movimentar("10", 14);
		m1.movimentar("10", "14");
	}
}
