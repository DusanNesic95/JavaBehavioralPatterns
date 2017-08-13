package net.sytes.codeline.main;

import net.sytes.codeline.strategy.Bar;
import net.sytes.codeline.strategy.Foo;
import net.sytes.codeline.strategy.Strategy;

public class MainStrategy {

	private static void execute(Strategy strategy) {
		strategy.solve();
	}
	
	public static void main(String[] args) {
		Strategy algorithms[] = {new Foo(), new Bar()};
		for (Strategy algorithm : algorithms) {
			execute(algorithm);
		}
	}
	
}
