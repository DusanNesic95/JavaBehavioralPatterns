package net.sytes.codeline.observer;

public class Lightning implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("Light is turned on!");
	}

}
