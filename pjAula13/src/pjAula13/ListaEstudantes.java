package pjAula13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class ListaEstudantes {
	public static void main(String[] args) {
		List<Estudante> sala = new ArrayList<Estudante>();
		
		for(int i=0; i<1_000; i++) {
			Estudante e = new Estudante();
			e.setRa(i);
			e.setNome(new Random().nextFloat() + "GG");
			
			sala.add(e);
		}
		Collections.sort(sala, new OrdenaSala());
		sala.forEach(s-> System.out.println(s));	
		
		Predicate<Estudante> filtro = p -> p.getRa() == 741;		
		sala.stream().filter(filtro).forEach(c-> System.out.println(c));
	}
}
