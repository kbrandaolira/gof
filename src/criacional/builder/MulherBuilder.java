package criacional.builder;

public abstract class MulherBuilder {

	protected Mulher mulher = new Mulher();
	
	public abstract void defineIdadeVirgindadePerdida();
	
	public abstract void defineAparoPubiano();
	
	public Mulher getMulher() {
		return mulher;
	}
	
}
