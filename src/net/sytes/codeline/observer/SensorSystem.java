package net.sytes.codeline.observer;

import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem {
	
	@SuppressWarnings("rawtypes")
	private Vector listeners = new Vector();
	
	@SuppressWarnings("unchecked")
	public void register(AlarmListener alarmListener) {
		listeners.addElement(alarmListener);
	}
	
	@SuppressWarnings("rawtypes")
	public void soundTheAlarm() {
		for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
			((AlarmListener) e.nextElement()).alarm();
		}
	}
}
