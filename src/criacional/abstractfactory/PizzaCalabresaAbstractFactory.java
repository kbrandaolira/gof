package criacional.abstractfactory;

import modelo.Pizza;

public class PizzaCalabresaAbstractFactory implements PizzaAbstractFactory {

	@Override
	public Pizza criarPizza() {
		Pizza pizza = new Pizza();
		pizza.setSabor("Calabresa");
		
		return pizza;
		
	}

}
