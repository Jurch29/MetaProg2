package expression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public abstract class Terme extends Expression implements Cloneable {
	
	protected Expression e1;
	protected Expression e2;
	protected char operateur;
	protected BiFunction<Double, Double, Double> f;

	public Terme(Expression e1, Expression e2, char operateur, BiFunction<Double, Double, Double> f) {
		this.e1 = e1;
		this.e2 = e2;
		this.operateur = operateur;
		this.f = f;
	}
	
	@Override
	public String toString() {
		return "("+this.e1+this.operateur+this.e2+')';
	}
	
	@Override
	public Expression eval(Map<Character, Expression> registre) {
		if (e1.eval(registre) instanceof Nombre && e2.eval(registre) instanceof Nombre) {
			return new Nombre(f.apply(((Nombre) e1.eval(registre)).getValue(),((Nombre) e2.eval(registre)).getValue()));
		}
		Terme clone = null;
		try {
			clone = (Terme) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		clone.e1 = e1.eval(registre);
		clone.e2 = e2.eval(registre);
		return clone;
	}
}
