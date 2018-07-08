package estrutural.proxy;

public class Main {

	public static void main(String[] args) {
		PizzariaProxy kayansPizza = new PizzariaProxy("Kayan's Pizza", 15);
		kayansPizza.dadosPizzaria();
		
		PizzariaProxy natachasPizza = new PizzariaProxy("Natacha's Pizza", 5);
		natachasPizza.dadosPizzaria();
		
	}
	
}
