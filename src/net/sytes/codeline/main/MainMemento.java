package net.sytes.codeline.main;

import net.sytes.codeline.memento.Caretaker;
import net.sytes.codeline.memento.Originator;

public class MainMemento {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		originator.setState("state1");
		originator.setState("state2");
		caretaker.addMemento(originator.save());
		originator.setState("state3");
		caretaker.addMemento(originator.save());
		originator.setState("state4");
		originator.restoreState(caretaker.getMemento());
	}
	
}
