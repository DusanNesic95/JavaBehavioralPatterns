package net.sytes.codeline.memento;

public class Originator {

	private String state;
	
	public void setState(String state) {
		System.out.println("Setting state to: " + state);
		this.state = state;
	}
	
	public void restoreState(Memento memento) {
		this.state = memento.getState();
		System.out.println("State after restoring it from Memento is: " + this.state);
	}
	
	public Memento save() {
		System.out.println("Saving state to Memento!");
		return new Memento(state);
	}
	
}
