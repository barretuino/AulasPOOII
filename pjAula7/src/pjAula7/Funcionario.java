package pjAula7;

import java.time.LocalTime;

public interface Funcionario {
	float calcularSalario();
	float registrarPonto(LocalTime local);
	float informarNumeroFilhos(int filhos);
}
