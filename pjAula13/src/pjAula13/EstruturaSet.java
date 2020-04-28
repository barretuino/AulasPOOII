package pjAula13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EstruturaSet {
	public static void main(String[] args) {
		Set lista = new TreeSet();
		
		lista.add("Paulo");
		lista.add("Carlos");
		lista.add("Heloisa");
		lista.add("Maria Aparecida");
		
		System.out.println(lista);
		
		Iterator i = lista.iterator();
		while(i.hasNext()) {
			System.out.println(i);
			i.next();
		}
	}
}
