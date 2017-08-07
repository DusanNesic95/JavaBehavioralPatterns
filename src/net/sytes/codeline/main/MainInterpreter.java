package net.sytes.codeline.main;

import net.sytes.codeline.interpreter.Expression;
import net.sytes.codeline.interpreter.Number;

import java.util.HashMap;
import java.util.Map;

import net.sytes.codeline.interpreter.Evaluator;

public class MainInterpreter {

	public static void main(String[] args) {
		final String expression = "w x z - +";
		final Evaluator sentence = new Evaluator(expression);
		final Map<String , Expression> variables = new HashMap<>();
		
		variables.put("w", new Number(5));
		variables.put("x", new Number(10));
		variables.put("z", new Number(42));
		
		final int result = sentence.interpret(variables);
		
		System.out.println("Rezultat je: " + result);
		
	}
	
}
