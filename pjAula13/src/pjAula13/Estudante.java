package pjAula13;

public class Estudante {
	private int ra;
	private String nome;
	
	@Override
	public String toString() {
		return "Ra: " + getRa() + " Nome " + getNome();
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
