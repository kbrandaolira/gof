package estrutural.decorator;

public class PizzaDecorator extends Pizza {

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
		
	}

	@Override
	public String getNome() {
		return super.nome + " e " + this.pizza.getNome();
	}
	
	@Override
	public double getValor() {
		return super.valor + this.pizza.valor;
	}
	
}
