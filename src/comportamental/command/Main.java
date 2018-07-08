package comportamental.command;

public class Main {

	public static void main(String[] args) {
		PizzaCommand pizzaCommand = new PizzaCommand();
		System.out.println( pizzaCommand.execute("4 Queijos") );
		
	}
	
}
