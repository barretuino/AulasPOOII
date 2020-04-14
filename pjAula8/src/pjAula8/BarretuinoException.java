package pjAula8;

public class BarretuinoException extends Exception {
	@Override
	public String toString() {
		return "Ocorreu um Erro de Barretuino";
	}
	
	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
