package stackengine;

public abstract class Instruction {
	
	protected String label;
	protected Machine machine;
	
	public Instruction(String label) {
		this.label = label;
	}
	
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
	protected abstract void run();
	
	@Override
	public String toString() {
		return this.label;
	}
}
