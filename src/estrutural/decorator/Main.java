package estrutural.decorator;

public class Main {

	public static void main(String[] args) {
		
		Pizza chocolate = new PizzaChocolate();
		PizzaDecorator chocolateMorango = new PizzaChocolateMorango(chocolate);
		System.out.println(chocolateMorango.getNome());
		System.out.println(chocolateMorango.getValor());
	}
	
}
