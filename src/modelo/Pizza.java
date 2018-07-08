package modelo;

import comportamental.state.Estado;

public class Pizza {

	private String sabor;
	
	private TipoMassa tipoMassa;
	
	private Estado estado;

	public Pizza(){}
	
	public Pizza( String sabor ){
		this.sabor = sabor;
		
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public TipoMassa getTipoMassa() {
		return tipoMassa;
	}
	
	public void setTipoMassa(TipoMassa tipoMassa) {
		this.tipoMassa = tipoMassa;
	}
	
	@Override
	public String toString() {
		return "Sou uma pizza com a massa " + this.tipoMassa + " e com o sabor de " + this.sabor;
		
	}
	
}
