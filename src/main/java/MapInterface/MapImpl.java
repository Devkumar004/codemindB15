package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {
	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();

		map.put(3443523789671L, "Rahul");
		map.put(344352378951L, "Virat");
		map.put(444464444444L, "Rahul");
		map.put(null, null);
		map.put(444464444444L, null);

		Set<Entry<Long, String>> set = map.entrySet();
		Iterator<Entry<Long, String>> it = set.iterator(); // FIXED: colon to semicolon

		while (it.hasNext()) {
			Entry<Long, String> ee = it.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());

			System.out.println("********************************************************************************");

			Student s1 = new Student("Sachin", 10, 'A');
			Student s2 = new Student("Rohit", 11, 'B');
			Student s3 = new Student("Saurav", 12, 'C');
			Map<Integer, Student> m = new HashMap<Integer, Student>();

			m.put(10, s1);
			m.put(11, s2);
			m.put(12, s3);

			Set<Entry<Integer, Student>> eee = m.entrySet();
			Iterator<Entry<Integer, Student>> it2 = eee.iterator();

			while (it2.hasNext()) {
				Entry<Integer, Student> e2 = it2.next();
				System.out.println(e2.getKey() + " : " + e2.getValue().toString());
			}
		}
	}
}

class Student {

	String studentName;
	int rollNumber;
	char division;

	public Student(String studentName, int rollNumber, char division) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.division = division;
	}

	public void StudentDetails() {
		System.out.println("Name : " + studentName + " Roll No. : " + rollNumber + " Divisin : " + division);
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", division=" + division + "]";
	}
}