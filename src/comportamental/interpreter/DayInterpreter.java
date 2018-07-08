package comportamental.interpreter;

public class DayInterpreter implements Interpreter{

	@Override
	public void interpret(Context context) {
		String arr [] = context.getInput().split("/");
		if( arr.length == 3 ){
			context.setOutput("Dia: " + arr[0]);

		} else {
			System.out.println("Dia não informado.");
			
		}
		
	}

}
