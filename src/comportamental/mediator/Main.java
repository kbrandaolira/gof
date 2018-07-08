package comportamental.mediator;

public class Main {

	public static void main(String[] args) {
		Pizzaria seuMane = new Pizzaria("Seu Man�");
		seuMane.zonaNorte();
		System.out.println(seuMane);
		
		Pizzaria seuJoao = new Pizzaria("Seu Jo�o");
		seuJoao.zonaOeste();
		System.out.println(seuJoao);
		
		Pizzaria dasPu = new Pizzaria("Das Pu");
		dasPu.zonaSul();
		System.out.println(dasPu);
		
	}
	
}
