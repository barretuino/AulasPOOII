package pjAula6;
/**
 * Classe de Modelagem Conceitual - Inseto
 * @author Paulo Barreto
 * @data 30/03/2020
 */

public class Inseto {
	//Atributos
	private int peso;
	private int numeroPatas;
	private String nome;
	private float distanciaPercorrida;
	
	//Método de Tratamento de Movimentação
	public void movimentar(int distanciaX) {
		setDistanciaPercorrida(distanciaX);
	}
	public void movimentar(int distanciaX, int distanciaY) {
		setDistanciaPercorrida(distanciaX * distanciaY);
	}
	public void movimentar(int distanciaX, int distanciaY, int distanciaZ) {
		setDistanciaPercorrida(distanciaX * distanciaY * distanciaZ);
	}
	
	//Métodos Getters and Setters
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	public void setDistanciaPercorrida(float distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
}
