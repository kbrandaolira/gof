package comportamental.templatemethod;

import modelo.TipoMassa;

public class PizzaMargueritaTemplateMethod extends PizzaTemplateMethod {

	@Override
	public String getSabor() {
		return "Marguerita";
		
	}

	@Override
	public TipoMassa getTipoMassa() {
		return TipoMassa.FINA;
		
	}

}
