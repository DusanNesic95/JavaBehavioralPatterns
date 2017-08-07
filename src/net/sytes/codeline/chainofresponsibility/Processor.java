package net.sytes.codeline.chainofresponsibility;

import java.util.Random;

public class Processor {

	private final static Random random = new Random();
	private static int nextId = 1;
	private int id = nextId++;
	
	public boolean execute(Image img) {
		if (random.nextInt(2) != 0) {
			System.out.println("Processor " + id + " is busy!");
			return false;
		}
		System.out.println("Processor " + id + " is working on " + img.process());
		return true;
	}
}
