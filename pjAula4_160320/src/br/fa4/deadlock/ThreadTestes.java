package br.fa4.deadlock;

public class ThreadTestes {
	
	class Tarefa extends Thread {
		  
	    private final long valorInicial;
	    private final long valorFinal;
	    private long total = 0;
	  
	    //método construtor que receberá os parâmetros da tarefa
	    public Tarefa(int valorInicial, int valorFinal) {
	        this.valorInicial = valorInicial;
	        this.valorFinal = valorFinal;
	    }
	  
	    //método que retorna o total calculado
	    public long getTotal() {
	        return total;
	    }
	  
	    /*
	     Este método se faz necessário para que possamos dar start() na Thread 
	     e iniciar a tarefa em paralelo
	     */
	    @Override
	    public void run() {
	        for (long i = valorInicial; i <= valorFinal; i++) {
	            total += i;
	        }
	    }
	}
	
	private static void execucaoParalela() {
		Programa p1 = new Programa();    
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        Programa p2 = new Programa();    
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();  
	}
	
	private static void paralelaAguardaFinalizacao() {
		 //cria três tarefas
        Tarefa t1 = new ThreadTestes().new Tarefa(0, 1000);
        t1.setName("Tarefa1");
        Tarefa t2 = new ThreadTestes().new Tarefa(1001, 2000);
        t2.setName("Tarefa2");
        Tarefa t3 = new ThreadTestes().new Tarefa(2001, 3000);
        t3.setName("Tarefa3");
  
        //inicia a execução paralela das três tarefas, iniciando três novas threads no programa
        t1.start();
        t2.start();
        t3.start();
  
        //aguarda a finalização das tarefas
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
  
        //Exibimos o somatório dos totalizadores de cada Thread
        System.out.println("Total: " + (t1.getTotal() + t2.getTotal() + t3.getTotal()));
	}
	
	private static void execucaoSincronizada() {
		        
        
	}
	
	public static void main(String[] args) {
		//Exemplo de duas threads partindo, uma primeiro, depois a outra, paralelas
		execucaoParalela();
	}
}

class Programa implements Runnable {

    private int id;           
    // colocar getter e setter pro atributo id

    public void run () {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return id;
    }
}
