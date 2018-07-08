package criacional.builder;

public class Deus {

	private MulherBuilder mulherBuilder;
	
	public Deus(MulherBuilder mulherBuilder){
		this.mulherBuilder = mulherBuilder;
		
	}
	
	public Mulher constroiMulher(){
		mulherBuilder.defineIdadeVirgindadePerdida();
		mulherBuilder.defineAparoPubiano();
		
		return mulherBuilder.getMulher();
		
	}
	
}
