package stackengine;

public class Sous extends Instruction {
	
	public Sous() {
		super("SOUS");
	}

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		Double val1 = this.machine.pilePop();
		Double val2 = this.machine.pilePop();
		this.machine.pilePush(val1-val2);
	}
}
