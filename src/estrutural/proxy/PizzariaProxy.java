package estrutural.proxy;

public class PizzariaProxy extends Pizzaria {

	public PizzariaProxy(String nome, int nFuncionarios){
		super(nome, nFuncionarios);
		
	}
	
	@Override
	public void dadosPizzaria() {
		if( super.nFuncionarios > 10 ){
			super.dadosPizzaria();
			
		} else {
			System.out.println("Pizzaria ainda está contratando...");
			
		}
		
		
	}
}
