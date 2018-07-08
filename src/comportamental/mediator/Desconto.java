package comportamental.mediator;

public class Desconto {
	
	private int porcentagem;
	
	public int getPorcentagem() {
		return porcentagem;
	}
	
	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public boolean possui(){
		if( this.porcentagem > 0 ){
			return true;
			
		}
		
		return false;
		
	}
	

}
