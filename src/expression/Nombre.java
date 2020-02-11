package expression;

import stackengine.Machine;

public class Nombre extends Expression {
	
	private final double nb;
	
	public Nombre(double number) {
		this.nb = number;
	}
	
	public double getValue() {
		return this.nb;
	}
	
	@Override
	public String toString() {
		return this.nb + "";
	}

	@Override
	public void toInst(Machine m) {
		// TODO Auto-generated method stub
		
	}
}
