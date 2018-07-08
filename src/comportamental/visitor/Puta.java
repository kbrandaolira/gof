package comportamental.visitor;

public class Puta extends ProfissaoDigna {

	public Puta(){
		super.nome = "Gabriela Pitanga";
		this.sexoOral = true;
		this.sexoAnal = true;
		this.valorHora = 50.;
		
	}
	
	private boolean sexoAnal;
	
	private boolean sexoOral;
	
	private Double valorHora;
	
	public boolean isSexoAnal() {
		return sexoAnal;
	}
	
	public void setSexoAnal(boolean sexoAnal) {
		this.sexoAnal = sexoAnal;
	}
	
	public boolean isSexoOral() {
		return sexoOral;
	}
	
	public void setSexoOral(boolean sexoOral) {
		this.sexoOral = sexoOral;
	}
	
	public Double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.nome + " / Sexo Oral: " + this.sexoOral + " / Sexo Anal: " + this.sexoAnal + ".";
	}
	
	
}
