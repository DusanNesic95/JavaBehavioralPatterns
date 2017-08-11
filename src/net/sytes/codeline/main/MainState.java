package net.sytes.codeline.main;

import net.sytes.codeline.state.StateContext;

public class MainState {

	public static void main(String[] args) {
		final StateContext stateContext = new StateContext();
		
		stateContext.writeName("Monday");
		stateContext.writeName("Tuesday");
		stateContext.writeName("Wednesday");
		stateContext.writeName("Thursday");
		stateContext.writeName("Friday");
		stateContext.writeName("Saturday");
		stateContext.writeName("Sunday");
	}
	
}
