package comportamental.strategy;

import modelo.Cliente;
import modelo.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza calabresa = new Pizza();
		calabresa.setSabor("Calabresa");
		Cliente pof = new Cliente();
		pof.setNome("Rafael Oliveiro D'assunção");
		pof.setEndereco("Rua do Pof, 152/10 - Bangu, Rio de Janeiro/RJ");
		
		MotoBoy alfredo = new MotoBoy();
		alfredo.entrega(calabresa, pof);
		
	}
	
}
