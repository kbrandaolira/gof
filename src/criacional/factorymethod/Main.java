package criacional.factorymethod;

public class Main {

	public static void main(String[] args) {
		PizzaFactoryMethod pizzaMarguerita = new PizzaMargueritaFactoryMethod();
		PizzaFactoryMethod pizzaPepperoni = new PizzaPepperoniFactoryMethod();

		System.out.println( pizzaMarguerita.criaPizza().getSabor() );
		System.out.println( pizzaPepperoni.criaPizza().getSabor() );
		
	}
	
}
