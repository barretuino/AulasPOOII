package pjAula8;

public enum Estado {
	SP(1, "S�o Paulo"),
	RJ(2, "Rio de Janeiro"),
	MG(3, "Minas Gerais"),
	ES(4, "Esp�rito Santo");
	//TODO: Inserir as demais Unidades Federativas (UF)

	int ordinal;
	String descricao;
	
	Estado(int ordinal, String descricao){
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
