package pjAula6;

public class ControllerApp {
	public void executar(Object objeto) {
		if(objeto instanceof Cadastro) {
			((Cadastro) objeto).inserir(objeto);
		}else {
			System.err.println("Não pertence a Cadastro está instância. ");
			System.out.println("Tipo correto seria " + objeto.getClass());
		}
	}
	
	public static void main(String[] args) {
		ControllerApp app = new ControllerApp();
		
		app.executar(new Cliente());
		app.executar(new Funcionario());
	}
}
