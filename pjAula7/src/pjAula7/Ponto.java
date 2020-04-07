package pjAula7;

public class Ponto extends FormaAbstrata {
	float medidas[] = new float[vetor.length];
	
	public Ponto(float medida) {
		super(1);
		medidas[0] = medida;
	}

	@Override
	public float calcularArea() {
		return medidas[0];
	}
}