package pjAula14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Manipula��o de Arquivos Textos
 * @author Paulo Barreto
 * @date 04/05/2020
 */

public class TesteFile {
	public static void main(String[] args) {
		//Constru��o de uma inst�ncia File
		File arquivo = new File("D:/caminho1/caminho2");
		arquivo.mkdirs();
		
		//Abertura para escrita
		/*if(arquivo.isFile()) {
			try {
				FileWriter escrita = new FileWriter(arquivo);
				escrita.write("Vanessa n�o ir� vir a aula hoje, pois, est� trabalhando");
				escrita.close();
				System.out.println("Arquivo Gravado com sucesso!");
			}catch(IOException erro) {
				System.err.println("Erro ao escrever o arquivo. " + erro);
			}
		}else {
			System.out.println("Voc� informou um diret�rio.");
		}*/
		
		if(arquivo.exists()) {
			try {
				FileReader leitura = new FileReader(arquivo);
				
				if(arquivo.isDirectory()) {
					for(File a : arquivo.listFiles()) {
						System.out.println(a.getName() + " Diret�rio "+ a.isDirectory());
					}
				}
				
				leitura.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.err.println("Arquivo inexist�nte. Verifique.");
		}
		
		
	}
}