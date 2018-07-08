package comportamental.observer;

import java.util.ArrayList;
import java.util.List;

import modelo.Pizza;

public class Forno {

	private List<FuncionarioObserver> observadores;

	public void addObservador(FuncionarioObserver observador){
		if( this.observadores == null ){
			this.observadores = new ArrayList<FuncionarioObserver>();
			
		}
		
		this.observadores.add(observador);
		
	}
	
	public void recebePizza(Pizza pizza){
		for(int i=3; i>=1; i--){
			System.out.println(i + "...");
			
		}
		
		this.notifica(pizza);
		
	}
	
	private void notifica(Pizza pizza){
		for(FuncionarioObserver observador : observadores){
			observador.ciente(pizza);
			
		}
		
	}
	
}
