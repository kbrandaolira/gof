package comportamental.chainofresponsability;


public abstract class IngredienteChain implements IngredienteCommand{
	
	private IngredienteChain next;
	
	private Ingrediente ingrediente;
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	
	public IngredienteChain(Ingrediente ingrediente){
		this.ingrediente = ingrediente;
		
	}
	
	public void next(IngredienteChain ingredienteChain){
		if( this.next == null ){
			this.next = ingredienteChain;
			
		} else {
			next.next(ingredienteChain);
			
		}
		
	}
	
	public void adicionaIngrediente(Ingrediente ingrediente){
		if( podeAdicionarIngrediente(ingrediente) ){
			this.acrescentaIngrediente();
		} else {
			System.out.println("Não pode adicionar o ingrediente.");
			
		}
		
	}
	
	private boolean podeAdicionarIngrediente(Ingrediente ingrediente){
		if( this.ingrediente.equals(ingrediente))
			return true;
		
		return false;
		
	}
	
	protected abstract void acrescentaIngrediente();
	

}
