

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bas_t_alunos")
public class Aluno {	
	@Id
	@Column(name="id_aluno")
	private int ra;
	@Column(name="nome_completo")
	private String nome;
	
	private float nota;
	
	private Float divida;
	
	
	
	public Float getDivida() {
		return divida;
	}
	public void setDivida(Float divida) {
		this.divida = divida;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
