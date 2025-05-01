package SundayRecap27;

public class CountObject {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(Student.cnt); // prints 3
	}
}

class Student {
	static int cnt = 0;

	Student() {
		cnt++;
	}

}