package estrutural.proxy;

public class Pizzaria {

	protected String nome;
	
	protected int nFuncionarios;
	
	public Pizzaria(String nome, int nFuncionarios){
		this.nome = nome;
		this.nFuncionarios = nFuncionarios;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getnFuncionarios() {
		return nFuncionarios;
	}
	
	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	public void dadosPizzaria(){
		System.out.println("A pizzaria " + this.nome + " possui " + this.nFuncionarios + " funcionários.");
		
	}
}
