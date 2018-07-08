package estrutural.facade;

public class Tabuleiro {

	private boolean carregado = false;
	
	public boolean isCarregado() {
		System.out.println("Tabuleiro carregado: " + this.carregado);
		return carregado;
	}
	
	public void carregaTabuleiro(){
		this.carregado = true;
		
	}
	
}
