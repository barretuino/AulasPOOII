package br.fa4.modelagem;
/**
 * Classe de Modelagem Conceitual Cliente
 * @author Prof. Paulo Barreto
 * @date 01/03/2016
 */
public class Cliente {
	//Atributos
	private int codigo;
	private String nome;
	private String email;
	
	@Override
	public String toString() {		
		return ("Código: " + getCodigo() +
				" Nome: "  + getNome()   +
				" Email: " + getEmail()   );
	}
	
	//Getters and Setter
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}