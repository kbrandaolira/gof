package estrutural.decorator;

public class PizzaChocolateMorango extends PizzaDecorator{

	public PizzaChocolateMorango(Pizza pizza) {
		super(pizza);
		nome = "Chocolate com Morango";
		valor = 30.;
	}

}
