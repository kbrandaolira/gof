package comportamental.visitor;

public class Main {

	public static void main(String[] args) {
		Visiting visiting = new Visiting();
		visiting.visit(new Puta());
		visiting.visit(new Cafetao());
		
	}
	
}
