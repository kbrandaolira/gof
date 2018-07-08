package comportamental.visitor;

public class Visiting implements Visitor {

	@Override
	public void visit(ProfissaoDigna profissaoDigna) {
		System.out.println(profissaoDigna);
		
	}

	
	
}
