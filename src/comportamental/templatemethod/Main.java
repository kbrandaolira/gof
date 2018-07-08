package comportamental.templatemethod;

public class Main {
	
	public static void main(String[] args) {
		PizzaTemplateMethod mussarela = new PizzaMussarelaTemplateMethod();
		mussarela.entregaPizza();
		
		PizzaTemplateMethod marguerita = new PizzaMargueritaTemplateMethod();
		marguerita.entregaPizza();
		
	}

}
