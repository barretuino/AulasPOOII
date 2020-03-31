package pjAula6;

/**
 * Exemplo Prático do uso de Polimorfismo (Sobrecarga de Métodos)
 * @author Paulo Barreto
 * @data 30/03/2020
 */
public class TesteAnimal {
	public static void main(String[] args) {
		Inseto formiga = new Inseto();
		Inseto joaninha = new Inseto();
		Inseto gafanhoto = new Inseto();
		
		formiga.movimentar(14);
		joaninha.movimentar(15, 16);
		gafanhoto.movimentar(17, 18, 19);
		
		System.out.println("Formiga move-se " + formiga.getDistanciaPercorrida());
		System.out.println("Joaninha move-se " + joaninha.getDistanciaPercorrida());
		System.out.println("Gafanhoto move-se " + gafanhoto.getDistanciaPercorrida());
	}
}
