package net.sytes.codeline.observer;

public class CheckList {

	public void byTheNumbers() {
		localize();
		isolate();
		identify();
	}
	
	protected void localize() {
		System.out.println("Establish a perimiter!");
	}
	
	protected void isolate() {
		System.out.println("Isolate the grid!");
	}
	
	protected void identify() {
		System.out.println("Identify the source!");
	}
}
