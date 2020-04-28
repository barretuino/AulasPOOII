package pjAula13;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo de Map
 * 		Key - chave de valor (único)
 * 		Value - valor contido naquela posição
 * @author Paulo Barreto
 * @date 27/04/2020
 */

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(754, "Carol");
		mapa.put(741, "Othon");
		mapa.put(357, "Igor");
				
		System.out.println(mapa.values());
		
		class ChaveDataEmpresa{
			int empresa;
			Date dataVenda;
			
			public ChaveDataEmpresa(int empresa, Date dataVenda) {
				super();
				this.empresa = empresa;
				this.dataVenda = dataVenda;
			}			
		}
		
		Map<ChaveDataEmpresa, Produto> mapaEstoque = new HashMap<ChaveDataEmpresa, Produto>();
				
		mapaEstoque.put(new ChaveDataEmpresa(1, new Date()), new Produto());
		mapaEstoque.put(new ChaveDataEmpresa(2, new Date()), new Produto());
		mapaEstoque.put(new ChaveDataEmpresa(3, new Date()), new Produto());
				
				
				
				
	}
}
