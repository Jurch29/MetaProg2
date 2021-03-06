package expression;

import java.util.Map;

import stackengine.Machine;

public class Variable extends Expression {
	
	protected final Character LABEL;

	public Variable(Character charac) {
		this.LABEL = charac;
	}
	
	@Override
	public String toString() {
		return this.LABEL + "";
	}
	
	@Override
	public Expression eval(Map<Character, Expression> registre) {
		if (registre.containsKey(this.LABEL))
			return registre.get(this.LABEL).eval();
		return null;
	}

	@Override
	public void toInst(Machine m) {
		// TODO Auto-generated method stub
		
	}
}
