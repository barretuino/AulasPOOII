package pjAutoboxingUnboxing;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) throws SQLException {
		List<Integer> lista = new ArrayList<Integer>();
		int listaA[] = new int[10_000_000];
		for(int i=0; i<10_000_000; i++) {
			listaA[i] = (int) (Math.random() * 100);
			lista.add(listaA[i]);
		}
		System.out.println("Soma com Autoboxing " + somarNumerosInteiros(lista));
		System.out.println("Soma simples " + somarNumerosInteiros(listaA));	
	}

	public static int somarNumerosInteiros(List<Integer> intList) {
		long inicio = System.currentTimeMillis();
		int sum = 0; 
		for (Integer i: intList) { 
			if ( i % 2 == 0) { 
				sum += i; 
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo " + (fim - inicio) + " ms");
		return sum; 
	}

	public static int somarNumerosInteiros(int intList[]) {
		long inicio = System.currentTimeMillis();
		int sum = 0; 
		for (int i: intList) { 
			if ( i % 2 == 0 ) { 
				sum += i; 
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo " + (fim - inicio) + " ms");
		return sum; 
	}
}