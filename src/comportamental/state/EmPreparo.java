package comportamental.state;

public class EmPreparo extends Estado {

	@Override
	public Estado proximoPasso() {
		

		return new Pronta();
		
	}

}
