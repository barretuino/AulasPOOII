package pjAula6;

/**
 * Interface Cadastro 
 * 	Create
 * 	Read
 * 	Update
 * 	Delete
 * @author Paulo Barreto
 * @date 30/03/2020
 */

public interface Cadastro {
	public void inserir(Object obj);
	public Object pesquisar(int id);
	public void excluir(int id);
	public void alterar(Object obj);
}





