package br.fa4.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.MalformedInputException;

public class ConhecerMetodos {

	Object objeto;
	
	public ConhecerMetodos(Object objeto) {
		this.objeto = objeto;
	}
	
	public void retornarEstrutura(){
		//Ver o tipo do objeto recebido
		System.out.println(
				Modifier.toString(
						objeto.getClass().getModifiers()));
		System.out.println(objeto.getClass());
		
		//Package
		System.out.println(objeto.getClass().getPackage());
		
		//Ancestral (Extends)
		System.out.println(objeto.getClass().getSuperclass());
		
		//Implementa alguma Interface
		System.out.println(objeto.getClass().getInterfaces());
		
		//Atributos?
		System.out.println("Atributos");
		for(Field e: objeto.getClass().getDeclaredFields()){
			System.out.print("Qualificador: ");
			Modifier.toString(e.getModifiers());
			System.out.println(e.getName());
			System.out.println(e.getType());
		}
		
		//Métodos?
		System.out.println("Métodos");
		for(Method e: objeto.getClass().getDeclaredMethods()){
			System.out.println(e.getName());
			System.out.println(e.getReturnType());
			System.out.println(e.getParameters().toString());
		}
	}
	public static void main(String[] args) {
		ConhecerMetodos cm;
		try {
			cm = new ConhecerMetodos(
					java.awt.Frame.class.newInstance());
			cm.retornarEstrutura();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
