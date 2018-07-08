package comportamental.interpreter;

public class YearInterpreter implements Interpreter {

	@Override
	public void interpret(Context context) {
		String arr [] = context.getInput().split("/");
		if( arr.length == 3 ){
			context.setOutput(context.getOutput() + "\nAno: " + arr[2]);

		} else {
			System.out.println("\nAno não informado.");
			
		}
		
		
	}

}
