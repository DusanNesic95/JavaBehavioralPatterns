package net.sytes.codeline.visitor;

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
