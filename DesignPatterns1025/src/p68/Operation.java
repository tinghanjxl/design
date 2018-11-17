package p68;

public abstract class Operation {
	protected int numberA;
	protected int numberB;
	public abstract int getResult();
	public int getNumberA() {
		return numberA;
	}
	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}
	public int getNumberB() {
		return numberB;
	}
	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
}
