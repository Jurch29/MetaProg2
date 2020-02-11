package expression;

import java.util.function.BiFunction;

import stackengine.Div;
import stackengine.Machine;

public class Division extends Terme {
	
	public static final BiFunction<Double, Double, Double> f = (x, y) ->x/y;

	public Division(Expression e1, Expression e2) {
		super(e1, e2, '/', f);
	}

	@Override
	public void toInst(Machine m) {
		// TODO Auto-generated method stub
		super.toInst(m);
		m.input(new Div());
	}
}
