package net.sytes.codeline.command;

public class FlipUpCommand implements Command {
	
	private Light lamp;
	
	public FlipUpCommand(final Light lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		lamp.turnOn();
	}

}
