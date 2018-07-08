package comportamental.iterator;


public class Main {
	
	public static void main(String[] args) {
		MyList<String> aprovadosIBGE = new MyList<String>();
		
		aprovadosIBGE.add("Kayan");
		aprovadosIBGE.add("Roberto");
		aprovadosIBGE.add("Léo Maquiagem");
		aprovadosIBGE.add("Drake");
		aprovadosIBGE.add("Léo Tatu");
		aprovadosIBGE.add("Léo OBMEP");
		aprovadosIBGE.add("Livinho");
		aprovadosIBGE.add("AndB");
		aprovadosIBGE.add("Alex");
		aprovadosIBGE.add("Cardelli");
		aprovadosIBGE.add("Mbielli");
		
		Iterator<?> myIterator = aprovadosIBGE.criaIterator();
		
		while( myIterator.hasNext() ){
			System.out.println( myIterator.next() );
			
		}
		
	}

}
