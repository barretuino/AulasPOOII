package pjAula7;

public class Reta extends FormaAbstrata{
	float medidas[] = new float[vetor.length];
	
	public Reta(float x1, float x2) {
		super(2);
		medidas[0]=x1;
		medidas[1]=x2;
	}

	@Override
	public float calcularArea() {		
		return medidas[1] - medidas[0];
	}
}
