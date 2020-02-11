package expression;

import java.util.HashMap;
import java.util.Map;

import stackengine.Add;
import stackengine.Machine;
import stackengine.Push;

public abstract class Expression {
	
	public Expression eval() {
		Map<Character, Expression> registre = new HashMap<Character, Expression>();
		return this.eval(registre);
	}
	public Expression eval(Map<Character, Expression> registre) {
		return this;
	}
	
	//Bad practice
	public static void exp2map(Machine m, Expression e) {
		m.store('b', 1.5);
		
		if (e instanceof Nombre) {
			Nombre n = (Nombre) e;
			m.input(new Push(n.getValue()));
		}
		else if (e instanceof Variable) {
			
		}
		else {
			Terme t = (Terme) e;
			exp2map(m, t.e1);
			exp2map(m, t.e2);
			
			if (e instanceof Addition) m.input(new Add());
		}
		
	}

	public abstract void toInst(Machine m);
}
