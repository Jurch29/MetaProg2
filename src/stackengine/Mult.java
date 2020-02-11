package stackengine;

public class Mult extends Instruction {
	
	public Mult() {
		super("MULT");
	}

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		Double val1 = this.machine.pilePop();
		Double val2 = this.machine.pilePop();
		this.machine.pilePush(val1*val2);
	}
}
