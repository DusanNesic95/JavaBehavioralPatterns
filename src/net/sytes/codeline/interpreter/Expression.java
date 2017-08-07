package net.sytes.codeline.interpreter;

import java.util.Map;

public interface Expression {

	public int interpret(final Map<String, Expression> variables);
	
}
