package comportamental.visitor;

public class Cafetao extends ProfissaoDigna{

	private Double comissao;
	
	public Cafetao(){
		super.nome = "POF";
		this.comissao = 10.;
		
	}
	
	public Double getComissao() {
		return comissao;
	}
	
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.nome + " / Comissão das Putarias: " + this.comissao + "%.";
		
	}
	
	
}
