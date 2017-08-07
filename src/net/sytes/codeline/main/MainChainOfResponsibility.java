package net.sytes.codeline.main;

import net.sytes.codeline.chainofresponsibility.IR;
import net.sytes.codeline.chainofresponsibility.Image;
import net.sytes.codeline.chainofresponsibility.LS;
import net.sytes.codeline.chainofresponsibility.Processor;

public class MainChainOfResponsibility {
	
	public static void main(String[] args) {
		Image[] images = {new IR(), new IR(), new LS(), new IR(), new LS()};
		Processor[] processors = {new Processor(), new Processor(), new Processor()};
		
		for (int i = 0, j; i < images.length; i++) {
			System.out.println("Operation #" + (i + 1) + ":");
			j = 0;
			while (!processors[j].execute(images[i])) {
                j = (j + 1) % processors.length;
            }
            System.out.println();
		}
	}
	
}
