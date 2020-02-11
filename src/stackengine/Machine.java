package stackengine;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	
	private Deque<Double> pile;
	private Map<Character, Double> registre;
	private List<Instruction> instructions;

	public Machine() {
		this.pile = new ArrayDeque<Double>();
		this.registre = new HashMap<Character, Double>();
		this.instructions = new ArrayList<Instruction>();
	}
	
	public void store(char label, double value) {
		this.registre.put(label, value);
	}
	
	public void input(Instruction instruction) {
		instruction.setMachine(this);
		this.instructions.add(instruction);
	}
	
	public void addToPile(double value) {
		this.pile.push(value);
	}
	
	public double getRegistreCarValue(char car) {
		return this.registre.get(car);
	}
	
	public Double pilePop() {
		return this.pile.pop();
	}
	
	public void pilePush(Double value) {
		this.pile.push(value);
	}
	
	public void run() {
		while (!this.instructions.isEmpty()) {
			this.instructions.remove(0).run();
		}
	}
	
	@Override
	public String toString() {
		return "PILE:"+this.pile.toString()+" REGISTRE:"+this.registre+" INSTRUCTIONS:"+this.instructions;
	}
}
