package comportamental.chainofresponsability;

public class Cebola extends IngredienteChain{

	public Cebola(){
		super(Ingrediente.CEBOLA);
		
	}

	@Override
	public void acrescentaIngrediente() {
		System.out.println("Acrescentando cebola...");
		
	}
	
}
