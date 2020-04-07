package pjAula7;

public class Retangulo extends FormaAbstrata {
	Reta[] vetor = new Reta[4];
	
	public Retangulo() {
		super(4);
		vetor[0] = new Reta(0, 10);
		vetor[1] = new Reta(0, 5);
		vetor[2] = new Reta(5, 10);
		vetor[3] = new Reta(10,15);
	}

	@Override
	public float calcularArea() {
		return vetor[0].calcularArea() * vetor[1].calcularArea();
	}	
}