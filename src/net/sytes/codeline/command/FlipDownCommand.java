package net.sytes.codeline.command;

public class FlipDownCommand implements Command {

	private Light lamp;
	
	public FlipDownCommand(final Light lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		lamp.turnOff();
	}

}
