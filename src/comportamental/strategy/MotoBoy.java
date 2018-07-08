package comportamental.strategy;

import modelo.Cliente;
import modelo.Pizza;

public class MotoBoy implements Entregador {

	@Override
	public void entrega(Pizza pizza, Cliente cliente) {
		System.out.println("Pizza de " + pizza.getSabor() + " entregue ao cliente " + cliente.getNome() + " situado no endereco " + cliente.getEndereco() + ".");
		
	}

}
