package estrutural.facade;

import java.util.ArrayList;
import java.util.List;

public class Pecas {

	private List<String> pecas = new ArrayList<String>();
	
	public void carregaPecas(){
		pecas.add("Bispo");
		pecas.add("Cavalo");
		pecas.add("Peão");
		pecas.add("Rainha");
		pecas.add("Rei");
		pecas.add("Torre");
		
	}
	
	public void informaPecas(){
		for( String peca : this.pecas ){
			System.out.println(peca);
			
		}
		
	}
	
	
	
}
