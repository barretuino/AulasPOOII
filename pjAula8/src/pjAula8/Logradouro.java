package pjAula8;

public enum Logradouro {
	RUA(1, "Rua"),
	AVENIDA(2, "Av."),
	PRACA(3, "Pc."),
	MARGINAL(4, "Mg.");	
	
	int ordinal;
	String descricao;
	
	Logradouro(int ordinal, String descricao){
		this.ordinal = ordinal;
		this.descricao = descricao;
	}
	
	public int getOrdinal() {
		return ordinal;
	}
	public String getDescricao() {
		return descricao;
	}
}