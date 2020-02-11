package expression;

import java.util.function.BiFunction;

public class Soustraction extends Terme {
	
	public static final BiFunction<Double, Double, Double> f = (x, y) ->x-y;

	public Soustraction(Expression e1, Expression e2) {
		super(e1, e2, '-', f);
	}

}
