package net.sytes.codeline.main;

import net.sytes.codeline.observer.Gates;
import net.sytes.codeline.observer.Lightning;
import net.sytes.codeline.observer.SensorSystem;
import net.sytes.codeline.observer.Surveillance;

public class MainObserver {

	public static void main(String[] args) {
		SensorSystem sensorSystem = new SensorSystem();
		sensorSystem.register(new Gates());
		sensorSystem.register(new Lightning());
		sensorSystem.register(new Surveillance());
		sensorSystem.soundTheAlarm();
	}
	
}
