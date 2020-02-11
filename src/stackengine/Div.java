package stackengine;

public class Div extends Instruction {
	
	public Div() {
		super("DIV");
	}

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		Double val1 = this.machine.pilePop();
		Double val2 = this.machine.pilePop();
		this.machine.pilePush(val2/val1);
	}
}
