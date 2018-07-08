package comportamental.templatemethod;

import modelo.TipoMassa;

public abstract class PizzaTemplateMethod {

	public void entregaPizza(){
		System.out.println( "Estamos entregando a pizza de " + this.getSabor() + " e massa " + this.getTipoMassa() + "." );
		
	}
	
	public abstract String getSabor();
	
	public abstract TipoMassa getTipoMassa();
	
}
