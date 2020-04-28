package pjAula13;

/**
 * Classe de Modelagem Conceitual
 * @author Paulo Barreto
 * @date 24/04/2020
 */

public class Produto {
	private int codigo;
	private String descricao;
	private boolean status;
	private float preco;
	
	Produto(){
		status = true;
	}
	
	@Override
	public String toString() {
		return "[name: " + getCodigo() + ", descricao: " + getDescricao() + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}