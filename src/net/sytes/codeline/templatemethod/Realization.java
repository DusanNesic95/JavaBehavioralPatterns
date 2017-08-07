package net.sytes.codeline.templatemethod;

public class Realization extends Specialization {

	@Override
	protected void stepTwo() {
		System.out.println("Realization.stepTwo()");
	}
	
	@Override
	protected void stepThreeTwo() {
		System.out.println("Realization.stepThreeTwo()");
	}
	
	@Override
	protected void stepFour() {
		System.out.println("Realization.stepFour()");
		super.stepFour();
	}
	
}
