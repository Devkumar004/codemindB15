package useOfThisandSuper;

public class This {
	int a = 10;

	void Task() {
		int a = 10;
		System.out.println("Addition of loacal and Instance variable = " + (a + this.a));
	}

	public static void main(String[] args) {
		This t = new This();
		t.Task();
	}
}

