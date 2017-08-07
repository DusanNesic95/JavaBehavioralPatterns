package net.sytes.codeline.templatemethod;

public abstract class Generalization {

	public void findSolution() {
		stepOne();
		stepTwo();
		stepThree();
		stepFour();
	}
	
	private void stepOne() {
		System.out.println("Generalization.stepOne()");
	}
	
	abstract void stepTwo();
	abstract void stepThree();
	
	protected void stepFour() {
		System.out.println("Generalization.stepFour()");
	}
	
}
