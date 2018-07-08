package criacional.builder;

public class Main {

	public static void main(String[] args) {
		
		MulherBuilder danada = new MulherDanadaBuilder();
		MulherBuilder santinha = new MulherSantinhaBuilder();
		MulherBuilder sapata = new MulherSapataBuilder();
		
		Deus deus = new Deus(danada);
		System.out.println(deus.constroiMulher());
		
		deus = new Deus(santinha);
		System.out.println(deus.constroiMulher());
		
		deus = new Deus(sapata);
		System.out.println(deus.constroiMulher());
		
	}
	
}
