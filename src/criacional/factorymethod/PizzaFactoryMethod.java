package criacional.factorymethod;

import modelo.Pizza;

public abstract class PizzaFactoryMethod {

	public Pizza criaPizza(){
		Pizza pizza = new Pizza();
		pizza.setSabor(this.defineSabor());
		
		return pizza;
		
	}
	
	protected abstract String defineSabor();
	
}
