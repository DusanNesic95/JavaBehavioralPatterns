package net.sytes.codeline.state;

public class StateContext {

	private StateLike myState;
	
	public StateContext() {
		setState(new StateLowerCase());
	}
	
	void setState(final StateLike newState) {
		myState = newState;
	}
	
	public void writeName(final String name) {
		myState.writeName(this, name);
	}
	
}
