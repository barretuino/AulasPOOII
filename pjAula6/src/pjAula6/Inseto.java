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
	
	//M�todo de Tratamento de Movimenta��o
	public void movimentar(int distanciaX) {
		setDistanciaPercorrida(distanciaX);
	}
	public void movimentar(int distanciaX, int distanciaY) {
		setDistanciaPercorrida(distanciaX * distanciaY);
	}
	public void movimentar(int distanciaX, int distanciaY, int distanciaZ) {
		setDistanciaPercorrida(distanciaX * distanciaY * distanciaZ);
	}
	
	//M�todos Getters and Setters
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
