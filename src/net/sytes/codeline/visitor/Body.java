package net.sytes.codeline.visitor;

public class Body implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
	
}
