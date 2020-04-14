package pjAula8;

public class Teste {
	public static void main(String[] args) {
		Pessoa thiago = new Pessoa();
		
		System.out.println(thiago.getNome());
		System.out.println(thiago.getId());
		System.out.println(thiago.getSalarios()[0]);
		
		//Bloco/Statement de tratamento de exceção
		try { //Inicio do Monitoramento
			throw new BarretuinoException();
			//System.out.println(thiago.getEndereco().getTipoLogradouro());
		}//Término
		catch(BarretuinoException ex) { //Escolhe se for a causa
			ex.toString();
		}
		
		
		int valor = 10;
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ex) {
			System.out.println("Não é possível realizar a operação, verifique.");
			System.out.println(ex.toString());
		}		
	}
}