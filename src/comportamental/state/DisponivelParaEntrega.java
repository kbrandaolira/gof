package comportamental.state;

public class DisponivelParaEntrega extends Estado {

	@Override
	public Estado proximoPasso() {
		// TODO Auto-generated method stub
		return new Entregue();
	}

}
