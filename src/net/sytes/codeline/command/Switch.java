package net.sytes.codeline.command;

import java.util.ArrayList;
import java.util.List;

public class Switch {

	List<Command> history = new ArrayList<>();
	
	public void storeAndExecute(final Command command) {
		this.history.add(command);
		command.execute();
	}
}
