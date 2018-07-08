package criacional.abstractfactory;

import modelo.Pizza;

public class PizzaMussarelaAbstractFactory implements PizzaAbstractFactory {

	@Override
	public Pizza criarPizza() {
		Pizza pizza = new Pizza();
		pizza.setSabor("Mussarela");
		
		return pizza;
		
	}

	
}
