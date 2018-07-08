package comportamental.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Interpreter> interpreters = new ArrayList<Interpreter>();
		interpreters.add(new DayInterpreter());
		interpreters.add(new MonthInterpreter());
		interpreters.add(new YearInterpreter());

		Context context = new Context("24/01/1991");
		
		for( Interpreter interpreter : interpreters ){
			interpreter.interpret(context);
			
		}
		
		System.out.println(context.getOutput());
		
	}
	
}
