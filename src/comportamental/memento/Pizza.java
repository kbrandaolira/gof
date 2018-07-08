package comportamental.memento;

import java.util.Date;


public class Pizza {

	private String sabor;
	
	private PizzaCareTaker careTaker;
	
	public String getSabor() {
		return sabor;
	}
	
	public PizzaCareTaker getCareTaker() {
		return careTaker;
	}
	
	public void setSabor( String sabor ){
		if( this.careTaker == null ){
			this.careTaker = new PizzaCareTaker();
			
		}
		
		if ( this.sabor != null ){
			this.careTaker.addMemento(this.sabor, new Date());
			
		}
		
		this.sabor = sabor;
		
	}
	
	public void desfazUltimaAlteracao(){
		
		PizzaMemento ultimoMemento = this.careTaker.getUltimoMemento();
		
		if( ultimoMemento != null ){
			this.sabor = ultimoMemento.getSabor();
			
		} else {
			System.out.println("Não tem, seu filha da puta!");
			
		}
		
	}
	
	
}
