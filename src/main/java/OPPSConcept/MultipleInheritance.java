package OPPSConcept;

public class MultipleInheritance {
	public static void main(String[] args) {
		A a = new D();
		a.a();
		System.out.println(a.hashCode());
		B b = new D();
		b.a();
		System.out.println(a.hashCode());
		D d = new D();
		d.test();
	}
}

interface A {
	public abstract void a();

}

interface B {
	public abstract void a();

	public abstract void test();
}

interface C extends A, B {

}

class D implements A, B {

	@Override
	public void a() {
		System.out.println("came from both method");

	}

	@Override
	public void test() {
		System.out.println("This is test");
	}

}