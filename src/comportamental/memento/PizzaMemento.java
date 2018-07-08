package comportamental.memento;

import java.util.Date;

public class PizzaMemento {

	private String sabor;
	
	private Date data;
	
	public PizzaMemento(String sabor, Date data){
		this.sabor = sabor;
		this.data = data;
		
	}
	
	public PizzaMemento(){}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.sabor + " - " + this.data;
	}
	
	
}
