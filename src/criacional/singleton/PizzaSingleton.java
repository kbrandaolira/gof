package criacional.singleton;

import modelo.Pizza;

public class PizzaSingleton {

	private static Pizza pizza = null;
	
	public static Pizza getInstance(){
		if( pizza == null ){
			pizza = new Pizza();
		}
		
		return pizza;
		
	}
	
	
}
