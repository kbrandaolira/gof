package criacional.builder;

public class Mulher {

	private int idadeVirgindadePerdida;
	
	private AparoPubiano aparoPubiano;
	
	
	public int getIdadeVirgindadePerdida() {
		return idadeVirgindadePerdida;
	}
	
	public void setIdadeVirgindadePerdida(int idadeVirgindadePerdida) {
		this.idadeVirgindadePerdida = idadeVirgindadePerdida;
	}
	
	public AparoPubiano getAparoPubiano() {
		return aparoPubiano;
	}
	
	public void setAparoPubiano(AparoPubiano aparoPubiano) {
		this.aparoPubiano = aparoPubiano;
	}
	
	@Override
	public String toString() {
		return "Oi, perdi minha virgindade com " + this.idadeVirgindadePerdida + " e minha pererequinha tem o corte estilo " + this.aparoPubiano;
	}
	
}
