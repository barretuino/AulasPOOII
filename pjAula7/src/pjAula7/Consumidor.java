package pjAula7;

import java.util.List;
import java.util.function.Predicate;

public abstract class Consumidor {
	public abstract Object pesquisar(int id);
	public abstract List<Object> listar(Predicate filter);
}
