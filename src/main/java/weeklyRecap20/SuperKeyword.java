package weeklyRecap20;

//super keyword
public class SuperKeyword {

	public static void main(String[] args) {
		Child child = new Child();

	}
}
class Parent {
	int machine_no = 101;

	Parent() {
		System.out.println("This is constructor from parent class");
	}

	void Print() {
		System.out.println("this is parent method ");
	}
}

class Child extends Parent {
	int machine_no = 201;

	Child() {
		System.out.println("This is constructor from child class");
	}

	void Show() {
		System.out.println("this is child method child" + machine_no);
		System.out.println("this is child method parent " + super.machine_no);
		super.Print();
	}
}
