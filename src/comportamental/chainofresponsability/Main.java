package comportamental.chainofresponsability;

public class Main {

	public static void main(String[] args) {
		IngredienteChain queijo = new Queijo();
		queijo.next(new Presunto());
		queijo.next(new Alho());
		queijo.next(new Cebola());
		
		queijo.adicionaIngrediente(Ingrediente.QUEIJO);
		queijo.adicionaIngrediente(Ingrediente.PRESUNTO);
		
	}
	
}
