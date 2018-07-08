package comportamental.memento;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.setSabor("Calabresa");
		pizza.setSabor("Alface com Brócolis");
		pizza.setSabor("Cachorro Quente");
		pizza.setSabor("Ovos com Linguiça");
		pizza.setSabor("Manjericão com Rúcula");
		pizza.setSabor("Chocolate com Abóbora");
		
		pizza.getCareTaker().imprimeMementos();
		System.out.println(pizza.getSabor());
		
		pizza.desfazUltimaAlteracao();
		System.out.println("----------------------------");
		
		pizza.getCareTaker().imprimeMementos();
		System.out.println(pizza.getSabor());
		
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		pizza.desfazUltimaAlteracao();
		
		
		
		
	}
	
}
