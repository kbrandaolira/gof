package comportamental.interpreter;

public class MonthInterpreter implements Interpreter{

	@Override
	public void interpret(Context context) {
		String arr [] = context.getInput().split("/");
		if( arr.length == 3 ){
			context.setOutput(context.getOutput() + "\nMês: " + arr[1]);

		} else {
			System.out.println("\nMês não informado.");
			
		}
		
	}

}
