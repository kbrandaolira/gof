package criacional.builder;

public class MulherDanadaBuilder extends MulherBuilder {

	@Override
	public void defineIdadeVirgindadePerdida() {
		super.mulher.setIdadeVirgindadePerdida(13);
		
	}

	@Override
	public void defineAparoPubiano() {
		super.mulher.setAparoPubiano(AparoPubiano.HITLER);
		
	}
	
}
