package criacional.builder;

public class MulherSantinhaBuilder extends MulherBuilder {

	@Override
	public void defineIdadeVirgindadePerdida() {
		super.mulher.setIdadeVirgindadePerdida(18);
		
	}

	@Override
	public void defineAparoPubiano() {
		super.mulher.setAparoPubiano(AparoPubiano.RASPADA);
		
	}

}
