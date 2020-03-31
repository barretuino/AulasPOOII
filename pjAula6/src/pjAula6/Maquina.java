package pjAula6;

import java.util.Date;

public abstract class Maquina {	
	public String modelo;
	public float valor;
	public Fabricante fabricante;
	
	public abstract void ligarDesligar();
	public abstract void obterGarantia(Date data);
	
	//TODO: uma s�rie de m�todos que toda m�quina tem
}
