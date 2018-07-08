package comportamental.mediator;

public class Main {

	public static void main(String[] args) {
		Pizzaria seuMane = new Pizzaria("Seu Mané");
		seuMane.zonaNorte();
		System.out.println(seuMane);
		
		Pizzaria seuJoao = new Pizzaria("Seu João");
		seuJoao.zonaOeste();
		System.out.println(seuJoao);
		
		Pizzaria dasPu = new Pizzaria("Das Pu");
		dasPu.zonaSul();
		System.out.println(dasPu);
		
	}
	
}
