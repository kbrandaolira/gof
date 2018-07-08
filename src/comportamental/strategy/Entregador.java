package comportamental.strategy;

import modelo.Cliente;
import modelo.Pizza;

public interface Entregador {

	public void entrega(Pizza pizza, Cliente cliente);
	
}
