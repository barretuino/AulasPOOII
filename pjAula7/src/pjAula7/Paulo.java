package pjAula7;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Paulo implements Aluno, Funcionario{

	@Override
	public float calcularSalario() {
		return 0;
	}

	@Override
	public float registrarPonto(LocalTime local) {
		return 0;
	}

	@Override
	public void matricular() {
		
	}

	@Override
	public List<Date> datasVencimento() {
		return null;
	}

	@Override
	public void imprimir() {
		
	}

	@Override
	public float informarNumeroFilhos(int filhos) {
		return 0;
	}
}
