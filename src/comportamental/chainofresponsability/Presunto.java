package comportamental.chainofresponsability;

public class Presunto extends IngredienteChain{

	public Presunto(){
		super(Ingrediente.PRESUNTO);
		
	}

	@Override
	public void acrescentaIngrediente() {
		System.out.println("Acrescentando presunto...");
		
	}
	
}
