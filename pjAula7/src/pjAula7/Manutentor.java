package pjAula7;

import java.util.List;
import java.util.function.Predicate;

public abstract class Manutentor {
	public abstract Object alterar(Object obj);
	public abstract boolean excluir(int id);
	public abstract List<Object> reducao(Predicate filtro, List<Object> lista);
}