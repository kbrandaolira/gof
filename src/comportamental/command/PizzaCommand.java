package comportamental.command;

import modelo.Pizza;

public class PizzaCommand implements IPizzaCommand {

	@Override
	public Pizza execute(String sabor) {
		Pizza pizza = new Pizza();
		pizza.setSabor(sabor);
		
		return pizza;
		
	}

}
