package net.sytes.codeline.strategy;

public class Bar extends StrategySearch {

	private int state = 1;
	
	@Override
	void preProcess() {
		System.out.println("Initializing pre process...");
	}

	@Override
	boolean search() {
		System.out.print("Search-" + state++ + "  ");
        return state == 3 ? true : false;
	}

	@Override
	void postProcess() {
		System.out.println("Post process mechanics...");
	}

}
