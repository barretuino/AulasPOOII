package br.fa4.reflection;

public class Teste {
	public Usuario usuario = new Usuario();
	
	public Teste() {
		usuario.setCodigo(1234);
		usuario.setNome("Paulo Barreto");
		usuario.setSenha("ABC1234");
		usuario.setStatus(true);
	}
}