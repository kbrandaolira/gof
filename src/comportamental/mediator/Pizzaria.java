package comportamental.mediator;

public class Pizzaria {

	private String nome;
	private Delivery delivery;
	private Desconto desconto;
	
	public Pizzaria(String nome){
		this.nome = nome;
		this.delivery = new Delivery();
		this.desconto = new Desconto();
		
	}
	
	public void zonaSul(){
		this.delivery.setPossui(true);
		this.delivery.setTipoEntrega("Mercedes-Benz CLA 200");
		this.delivery.setVinteQuatroHoras(true);
		this.desconto.setPorcentagem(0);
		
	}
	
	public void zonaOeste(){
		this.delivery.setPossui(true);
		this.delivery.setTipoEntrega("Kawasaki Ninja");
		this.delivery.setVinteQuatroHoras(false);
		this.desconto.setPorcentagem(10);
		
	}
	
	public void zonaNorte(){
		this.delivery.setPossui(true);
		this.delivery.setTipoEntrega("Jegue");
		this.delivery.setVinteQuatroHoras(false);
		this.desconto.setPorcentagem(90);
		
	}
	
	@Override
	public String toString() {
		StringBuilder bldr = new StringBuilder();
		
		bldr.append("A pizzaria "+ this.nome);
		
		if( this.delivery.isPossui() ){
			bldr.append(" possui delivery" );
			
			if( this.delivery.vinteQuatroHoras ){
				bldr.append(" 24 horas");
				
			}
			
			if( this.delivery.getTipoEntrega() != null ){
				bldr.append(" e entregamos de " + this.delivery.tipoEntrega +".");
				
			}
			
		}
		else{
			bldr.append(" não possui delivery.");
			
		}
		
		if( this.desconto.possui() ){
			bldr.append(" Você cliente possui desconto de " + this.desconto.getPorcentagem() + "%.");
			
		} else {
			bldr.append(" Você cliente, infelizmente, não possui desconto.");
			
		}
		
		return bldr.toString();
		
	}
	
}
