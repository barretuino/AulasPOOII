package pjAula13;

import java.util.Comparator;

public class OrdenaSala implements Comparator<Estudante>{ 
	// 	Usado para classifica��o em ordem crescente de ra 
	public int compare(Estudante a, Estudante b) 
	{ 
		return b.getRa() - a.getRa(); 
	} 
} 