package comportamental.chainofresponsability;

public interface IngredienteCommand {

	void next(IngredienteChain ingredienteChain);
	
}
