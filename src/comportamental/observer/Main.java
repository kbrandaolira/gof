package comportamental.observer;

import modelo.Pizza;

public class Main {
	
	public static void main(String[] args) {
		Forno forno = new Forno();
		forno.addObservador(new Pizzaiolo("Kayan"));
		forno.addObservador(new Atendente("Natacha Castelhano"));
		
		forno.recebePizza(new Pizza("Calabresa"));
		
	}

}
