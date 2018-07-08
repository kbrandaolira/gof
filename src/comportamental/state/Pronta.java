package comportamental.state;

public class Pronta extends Estado {

	@Override
	public Estado proximoPasso() {
		return new DisponivelParaEntrega();
	}
	
}
