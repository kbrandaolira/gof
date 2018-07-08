package criacional.builder;

public class MulherSapataBuilder extends MulherBuilder {

	@Override
	public void defineIdadeVirgindadePerdida() {
		super.mulher.setIdadeVirgindadePerdida(25);
		
	}

	@Override
	public void defineAparoPubiano() {
		super.mulher.setAparoPubiano(AparoPubiano.PELUDA);
		
	}

}
