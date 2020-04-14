package pjAula8;

import java.io.Serializable;

/**
 * Classe de Modelagem Conceitual
 * @author Paulo Barreto
 * @data 13/04/2020
 */

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private Endereco endereco;
	private String nome;
	private float salarios[] = new float[2];
	private transient float imposto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getSalarios() {
		return salarios;
	}
	public void setSalarios(float[] salarios) {
		this.salarios = salarios;
	}	
}