package useOfThisandSuper;

public class SuperUse {

	public static void main(String[] args) {
		Child child = new Child();
		child.Cmethod();

	}
}

class Parent {
	int a = 10;

	void Pmethod() {
		int a = 30;
		System.out.println("Output from parent class method " + a);
	}
}

class Child extends Parent {
	public Child() {
	}

	void Cmethod() {
		int a = 30;
		System.out.println("Output from child class " + (super.a + a));
		super.Pmethod();
	}
}