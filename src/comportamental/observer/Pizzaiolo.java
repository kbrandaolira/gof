package comportamental.observer;

import modelo.Pizza;

public class Pizzaiolo extends Pessoa implements FuncionarioObserver {

	public Pizzaiolo(String nome) {
		super(nome);
	}

	@Override
	public void ciente(Pizza pizza) {
		System.out.println("O pizzaiolo "+ super.nome +" está ciente de que a pizza de " + pizza.getSabor() + " está pronta.");		
	}

}
