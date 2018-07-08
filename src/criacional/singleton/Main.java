package criacional.singleton;

import modelo.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = PizzaSingleton.getInstance();
		System.out.println( pizza.toString() );
		
	}
	
}
