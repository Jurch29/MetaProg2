package stackengine;

public class Push extends Instruction {

	protected Double value;
	protected Character car;
	
	public Push(double value) {
		super("PUSH");
		this.value = value;
	}
	
	public Push(char label) {
		super("PUSH");
		this.car = label;
		this.value = null;
	}
	
	@Override
	public String toString() {
		Object strObjValue = (this.value == null) ? this.car.toString() : this.value;
		return super.toString()+' '+strObjValue;
	}

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		if (this.value==null)
			this.value = this.machine.getRegistreCarValue(this.car);
		this.machine.addToPile(this.value);
	}
}
