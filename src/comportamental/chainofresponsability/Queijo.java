package comportamental.chainofresponsability;

public class Queijo extends IngredienteChain {

	public Queijo() {
		super(Ingrediente.QUEIJO);
		
	}

	@Override
	public void acrescentaIngrediente() {
		System.out.println("Acrescentando queijo...");
		
	}
	
}
