package estrutural.FlyWeight;

public class PizzaFlyweight implements IPizzaFlyweight {

	private Pizzaiolo pizzaiolo;
	
	public PizzaFlyweight(Pizzaiolo pizzaiolo) {
		this.pizzaiolo = pizzaiolo;
	}
	
	@Override
	public void fazPizza(Pizzaria pizzaria) {
		this.pizzaiolo.fazPizza();
		System.out.println(" na pizzaria " + pizzaria.getNome());
		
	}

}
