package OPPSConcept;

public abstract class AbstractionEx {

	public static void main(String[] args) {

		ArthimaticOp A = new ArthimaticOp();
		A.Add();
		A.Subt();
		A.Multiply();
		A.Divide();
		A.Task();
	}
}

abstract class UnimplementedClass {
	/**
	 * Call constructor.
	 */
	UnimplementedClass() {
		System.out.println("Constructor from parent class");
	}

	/**
	 * Call Abstract method.
	 */
	abstract void Add();

	abstract void Subt();

	abstract void Multiply();

	abstract void Divide();

	/**
	 * Call non Abstract methods.
	 */
	void Task() {
		System.out.println("This is from parent class");
	}
}

class ArthimaticOp extends UnimplementedClass {
	int a = 22;
	int b = 55;

	void Add() {
		System.out.println(a + b);
	}

	void Subt() {
		System.out.println(b - a);
	}

	void Multiply() {
		System.out.println(a * b);
	}

	void Divide() {
		System.out.println(b / a);
	}

	public ArthimaticOp() {

		System.out.println("Constructor from child class");
	}
}