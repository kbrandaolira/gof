package comportamental.chainofresponsability;

public class Alho extends IngredienteChain{

	public Alho(){
		super(Ingrediente.ALHO);
		
	}

	@Override
	public void acrescentaIngrediente() {
		System.out.println("Acrescentando alho...");
		
	}
	
}
