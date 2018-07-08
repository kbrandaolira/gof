package criacional.abstractfactory;

public class Main {

	public static void main(String[] args) {
		PizzaAbstractFactory calabresa = new PizzaCalabresaAbstractFactory();
		System.out.println( calabresa.criarPizza().getSabor() );
		
		PizzaAbstractFactory mussarela = new PizzaMussarelaAbstractFactory();
		System.out.println( mussarela.criarPizza().getSabor() );
		
		
	}
	
}