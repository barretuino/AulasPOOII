package pjAula7;

import java.util.Date;
import java.util.List;

/**
 * Exemplo de Interface
 * @author Paulo Barreto
 * @date 06/04/2020
 */

public interface Aluno {
	void matricular();
	List<Date> datasVencimento();
	void imprimir();
}
