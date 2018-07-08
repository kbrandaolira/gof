package comportamental.visitor;

public class ProfissaoDigna {

	protected String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void accept(Visitor visitor){
		System.out.println("Um visitante esteve aqui...");
		visitor.visit(this);
		
	}
	
}
