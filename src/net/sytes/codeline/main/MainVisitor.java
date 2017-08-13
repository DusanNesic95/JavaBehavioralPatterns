package net.sytes.codeline.main;

import net.sytes.codeline.visitor.Car;
import net.sytes.codeline.visitor.CarElementDoVisitor;
import net.sytes.codeline.visitor.CarElementPrintVisitor;

public class MainVisitor {

	public static void main(String[] args) {
		final Car car = new Car();
		
		car.accept(new CarElementDoVisitor());
		car.accept(new CarElementPrintVisitor());
	}
	
}
