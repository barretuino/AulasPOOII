package pjAula14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Manipulação de Arquivos Textos
 * @author Paulo Barreto
 * @date 04/05/2020
 */

public class TesteFile {
	public static void main(String[] args) {
		//Construção de uma instância File
		File arquivo = new File("D:/caminho1/caminho2");
		arquivo.mkdirs();
		
		//Abertura para escrita
		/*if(arquivo.isFile()) {
			try {
				FileWriter escrita = new FileWriter(arquivo);
				escrita.write("Vanessa não irá vir a aula hoje, pois, está trabalhando");
				escrita.close();
				System.out.println("Arquivo Gravado com sucesso!");
			}catch(IOException erro) {
				System.err.println("Erro ao escrever o arquivo. " + erro);
			}
		}else {
			System.out.println("Você informou um diretório.");
		}*/
		
		if(arquivo.exists()) {
			try {
				FileReader leitura = new FileReader(arquivo);
				
				if(arquivo.isDirectory()) {
					for(File a : arquivo.listFiles()) {
						System.out.println(a.getName() + " Diretório "+ a.isDirectory());
					}
				}
				
				leitura.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.err.println("Arquivo inexistênte. Verifique.");
		}
		
		
	}
}