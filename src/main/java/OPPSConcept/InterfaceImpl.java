package OPPSConcept;

public class InterfaceImpl {

	public static void main(String[] args) {
		MyImplClass MI = new MyImplClass();
		MI.addition();
		MI.sub();
		MI.multi();
	}
}
interface Myinterface {

	public static final int a = 10;
	int b = 40;
/**
 * This is addition of two integer number.
 */
	public abstract void addition();

	void sub();
	/**
	 * This is subtraction of two integer number.
	 */
}

class MyImplClass implements Myinterface {

	@Override
	public void addition() {
		System.out.println(10 + 20);
	}

	@Override
	public void sub() {
		System.out.println(30 - 20);

	}
	public void multi() {
		System.out.println(20 * 99);
	}
}