package criacional.prototype;

public class PizzaPrototype implements IPizzaPrototype {

	private String sabor;
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public PizzaPrototype clonando() {
		PizzaPrototype pizzaClonada = new PizzaPrototype();
		pizzaClonada.setSabor( this.sabor );
		
		return pizzaClonada;
	}
	
}
