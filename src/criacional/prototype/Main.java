package criacional.prototype;

public class Main {

	public static void main(String[] args) {
		PizzaPrototype pizzaFrangoCatupiry = new PizzaPrototype();
		pizzaFrangoCatupiry.setSabor("Frango com Catupiry");
		System.out.println(pizzaFrangoCatupiry.getSabor());
		
		PizzaPrototype pizzaFrangoCatupiryClonada = pizzaFrangoCatupiry.clonando();
		System.out.println(pizzaFrangoCatupiryClonada.getSabor());
		
	}
	
}
