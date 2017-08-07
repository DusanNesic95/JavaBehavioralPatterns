package net.sytes.codeline.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> mementos = new ArrayList<>();
	
	public void addMemento(Memento toAdd) {
		this.mementos.add(toAdd);
	}
	
	public Memento getMemento() {
		return this.mementos.get(1);
	}
}
