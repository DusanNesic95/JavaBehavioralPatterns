package net.sytes.codeline.main;

import net.sytes.codeline.iterator.Iterator;
import net.sytes.codeline.iterator.OSRepo;

public class MainIterator {

	public static void main(String[] args) {
		OSRepo osRepo = new OSRepo();
		
		for (Iterator iterator = osRepo.getIterator(); iterator.hasNext();) {
			String osName = (String) iterator.next();
			System.out.println("Name of the current OS is: " + osName);
		}
	}
	
}
