package comportamental.interpreter;

public class Context {
	
	private String input;
	
	private String output = "";
	
	public Context(String input){
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}

}
