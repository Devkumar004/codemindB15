package encap;

public class EncapsulationEx {

	public static void main(String[] args) {
		Cd c = new Cd();
		c.setA(10);
		System.out.println(c.getA());
		c.setA(20);
		System.out.println(c.getA());
	}
}

class Cd {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}