package net.sytes.codeline.templatemethod;

public abstract class Specialization extends Generalization {

	@Override
	protected void stepThree() {
		stepThreeOne();
		stepThreeTwo();
		stepThreeThree();
	}
	
	private void stepThreeOne() {
		System.out.println("Specialization.stepThreeOne()");
	}
	
	abstract void stepThreeTwo();
	
	private void stepThreeThree() {
		System.out.println("Specialization.stepThreeThree()");
	}
	
}
