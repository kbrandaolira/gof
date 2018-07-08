package estrutural.FlyWeight;

public class Main {
	
	public static void main(String[] args) {
		Pizzaiolo pizzaiolo = new Pizzaiolo();
		Pizzaria pizzaria = new Pizzaria("Kayan");
		IPizzaFlyweight flyweight = new PizzaFlyweight(pizzaiolo);
		flyweight.fazPizza(pizzaria);
	}
	
	
}
