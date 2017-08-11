package net.sytes.codeline.observer;

public class Surveillance extends CheckList implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("Surveillance is turned, by number:");
		byTheNumbers();
	}

	protected void isolate() {
		System.out.println("Train the cameras!");
	}
	
}
