package net.sytes.codeline.observer;

public class Gates implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("The gate is now closed!");
	}

}
