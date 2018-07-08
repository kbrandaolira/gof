package comportamental.templatemethod;

import modelo.TipoMassa;

public class PizzaMussarelaTemplateMethod extends PizzaTemplateMethod {

	@Override
	public String getSabor() {
		return "Mussarela";
		
	}

	@Override
	public TipoMassa getTipoMassa() {
		return TipoMassa.NORMAL;
		
	}

}
