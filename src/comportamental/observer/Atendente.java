package comportamental.observer;

import modelo.Pizza;

public class Atendente extends Pessoa implements FuncionarioObserver {

	public Atendente(String nome) {
		super(nome);
	}

	@Override
	public void ciente(Pizza pizza) {
		System.out.println("O atendente "+ super.nome +" está ciente de que a pizza de " + pizza.getSabor() + " está pronta.");
		
	}

}
