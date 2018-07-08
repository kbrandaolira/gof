package estrutural.facade;

public class XadrezFacade {

	private Tabuleiro tabuleiro;
	private Pecas pecas;
	
	public XadrezFacade() {
		this.tabuleiro = new Tabuleiro();
		this.tabuleiro.carregaTabuleiro();
		
		this.pecas = new Pecas();
		this.pecas.carregaPecas();
		
	}
	
	public void isCarregado(){
		this.tabuleiro.isCarregado();
			
	}
	
	public void informaPecas(){
		this.pecas.informaPecas();
		
	}
	
}
