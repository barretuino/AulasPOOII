package pjAula6;

public class Funcionario implements Cadastro {

	@Override
	public void inserir(Object obj) {
		System.out.println("Inserido com sucesso!");
	}

	@Override
	public Object pesquisar(int id) {
		return null;
	}

	@Override
	public void excluir(int id) {

	}

	@Override
	public void alterar(Object obj) {

	}
}