package estrutural.adapter;

public class Main {

	
	public static void main(String[] args) {
		Delivery pizzaria = new PizzariaAdapter();
		pizzaria.entrega("Pizza de Mussarela");
		
		Delivery padaria = new PadariaAdapter();
		padaria.entrega("Pão de Sal");
		
	}

}
