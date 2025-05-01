package Interfacess;

public class InterfaceImps {
	public static void main(String[] args) {
		Arithmetic A = new Arithmetic();
		A.Addition();
		A.Subtraction();
		A.Multiplication();
		A.Division();
		A.Modulus();
	}
}

interface ArithmaticOp {

	public abstract void Addition();

	void Subtraction();

	void Multiplication();

	void Division();
}

class Arithmetic implements ArithmaticOp {

	public static final int A = 85;
	int B = 66;

	public void Addition() {
		System.out.println("Addition  : " + (A + B));
	}

	public void Subtraction() {
		System.out.println("Subtraction  : " + (A - B));
	}

	public void Multiplication() {
		System.out.println("Multiplication : " + (A * B));
	}

	public void Division() {
		System.out.println("Division : " + (A / B));
	}
	public void Modulus() {
		System.out.println("Modulus : " +(A%B));
	}
}