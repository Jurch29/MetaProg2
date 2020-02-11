package main;

import java.util.HashMap;
import java.util.Map;

import expression.*;
import stackengine.Add;
import stackengine.Div;
import stackengine.Machine;
import stackengine.Push;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testExpression();
		testStack();
		testExp2Map();
	}
	
	private static void testExp2Map() {
		// TODO Auto-generated method stub
		Expression e1 = new Division(new Nombre(7), new Nombre(2));
		Expression e2 = new Addition(e1, new Variable('a'));
		
		Machine m = new Machine();
		m.store('a', 1.5);
		Expression.exp2map(m, e2);
		System.out.println();
		System.out.println(m);
	}

	private static void testStack() {
		Machine m = new Machine();
		m.store('a', 1.5);
		m.input(new Push(3));
		m.input(new Push(2));
		m.input(new Push(7));
		m.input(new Push(2));
		m.input(new Div());
		m.input(new Push('a'));
		m.input(new Add());
		System.out.println(m);
		m.run();
		System.out.println(m);
	}

	public static void testExpression() {
		Expression e1 = new Division(new Nombre(7), new Nombre(2));
		Expression e2 = new Addition(e1, new Variable('a'));
		Expression e3 = new Addition(new Nombre(5), new Nombre(5));
		
		System.out.println(e3.eval());
		System.out.println(e2);
		
		Expression e4 = new Addition(new Addition(new Nombre(8), new Variable('b')), new Addition(new Nombre(4), new Nombre(9)));
		System.out.println(e4.eval());
		
		Expression e5 = new Multiplication(e1, e2);
		System.out.println(e5);
		System.out.println(e5.eval());
		
		Map<Character, Expression> registre = new HashMap<Character, Expression>();
		registre.put('b', new Nombre(5));
		
		Expression re2bis = e4.eval(registre);
		System.out.println(re2bis);
	}
}
