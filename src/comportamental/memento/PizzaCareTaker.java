package comportamental.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PizzaCareTaker {
	
	private List<PizzaMemento> mementos = new ArrayList<PizzaMemento>();
	
	public void addMemento(String sabor, Date data){
		if( this.mementos == null ){
			this.mementos = new ArrayList<PizzaMemento>();
			
		}
		
		this.mementos.add(new PizzaMemento(sabor, data));
		
	}
	
	public PizzaMemento getUltimoMemento(){
		PizzaMemento ultimoMemento = null;
		
		if( this.mementos != null && this.mementos.size() > 0 ){
			ultimoMemento = this.mementos.get(this.mementos.size()-1);
			this.mementos.remove(ultimoMemento);
			
		}
		
		return ultimoMemento;
		
	}
	
	public void imprimeMementos(){
		for( PizzaMemento memento : this.mementos ){
			System.out.println(memento);
			
		}
		
	}
	
}
