package comportamental.mediator;

public class Delivery {

	public boolean vinteQuatroHoras;
	
	public String tipoEntrega;
	
	public boolean possui;
	
	public boolean isPossui() {
		return possui;
	}
	
	public void setPossui(boolean possui) {
		this.possui = possui;
	}
	
	public boolean isVinteQuatroHoras() {
		return vinteQuatroHoras;
	}
	
	public void setVinteQuatroHoras(boolean vinteQuatroHoras) {
		this.vinteQuatroHoras = vinteQuatroHoras;
	}
	
	public String getTipoEntrega() {
		return tipoEntrega;
	}
	
	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
}
