package comportamental.command;

import modelo.Pizza;

public interface IPizzaCommand {

	Pizza execute(String sabor);
	
}
