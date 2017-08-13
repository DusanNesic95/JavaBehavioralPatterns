package net.sytes.codeline.strategy;

public class Foo extends StrategySolution {
	
	private int state = 1;

	@Override
	void start() {
		System.out.println("Starting...");
	}

	@Override
	boolean nextTry() {
		System.out.println("Next try: " + state++ + "...");
		return true;
	}

	@Override
	boolean isSolution() {
		System.out.println("Solution is: " + (state == 3) + "...");
		return (state == 3);
	}

	@Override
	void stop() {
		System.out.println("Stopping...");
	}

}
