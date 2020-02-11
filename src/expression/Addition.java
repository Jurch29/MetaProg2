package expression;

import java.util.function.BiFunction;

import stackengine.Add;
import stackengine.Machine;

public class Addition extends Terme {
	
	public static final BiFunction<Double, Double, Double> f = (x, y) ->x+y;

	public Addition(Expression e1, Expression e2) {
		super(e1, e2, '+', f);
	}

	@Override
	public void toInst(Machine m) {
		// TODO Auto-generated method stub
		super.toInst(m);
		m.input(new Add());
	}
	
}
