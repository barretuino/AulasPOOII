package pjAula8;

/**
 * Classe de Modelagem Conceitual
 * @author Paulo Barreto
 * @date 13/04/2020
 */

public class Endereco {
	//Exemplo de Enum
	private Logradouro tipoLogradouro;
	private String descLogradouro;
	private int numero;
	private String bairro, cidade, pais, cep;
	//Exemplo de Enum
	private Estado estado;
	
	public Logradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(Logradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getDescLogradouro() {
		return descLogradouro;
	}
	public void setDescLogradouro(String descLogradouro) {
		this.descLogradouro = descLogradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
