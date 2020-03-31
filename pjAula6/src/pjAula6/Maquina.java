package pjAula6;

import java.util.Date;

public abstract class Maquina {	
	public String modelo;
	public float valor;
	public Fabricante fabricante;
	
	public abstract void ligarDesligar();
	public abstract void obterGarantia(Date data);
	
	//TODO: uma série de métodos que toda máquina tem
}
