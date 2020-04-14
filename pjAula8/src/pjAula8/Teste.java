package pjAula8;

public class Teste {
	public static void main(String[] args) {
		Pessoa thiago = new Pessoa();
		
		System.out.println(thiago.getNome());
		System.out.println(thiago.getId());
		System.out.println(thiago.getSalarios()[0]);
		
		//Bloco/Statement de tratamento de exce��o
		try { //Inicio do Monitoramento
			throw new BarretuinoException();
			//System.out.println(thiago.getEndereco().getTipoLogradouro());
		}//T�rmino
		catch(BarretuinoException ex) { //Escolhe se for a causa
			ex.toString();
		}
		
		
		int valor = 10;
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ex) {
			System.out.println("N�o � poss�vel realizar a opera��o, verifique.");
			System.out.println(ex.toString());
		}		
	}
}