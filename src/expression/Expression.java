package expression;

import java.util.HashMap;
import java.util.Map;

public abstract class Expression {
	
	public Expression eval() {
		Map<Character, Expression> registre = new HashMap<Character, Expression>();
		return this.eval(registre);
	}
	public Expression eval(Map<Character, Expression> registre) {
		return this;
	}
	
	public static void exp2map() {
		
	}

}
