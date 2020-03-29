package br.edu.barretuino.threads;

public class Principal {
	public static void main(String[] args) {
		Thread threads[] = new Thread[10];
		
		//Instanciando
		for(int i=0; i<10; i++){
			Contador c = new Contador(Integer.toString(i));
			threads[i] = new Thread(c) ;
		}
		
		//Iniciando (Start) das Threads
		for(int i=0; i<10; i++){
			threads[i].start();
		}
		
		System.out.println("Finalizado Programa");
	}
}