package collectionFramework.SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCharactics {

	public static void main(String[] args) {

		TreeSet<Integer> TreeSet = new TreeSet<Integer>();

		TreeSet.add(10);
		TreeSet.add(5);
		TreeSet.add(20);
		TreeSet.add(10);
		TreeSet.add(100);
//		TreeSet.add(null);// not allowed

		Iterator<Integer> iterator = TreeSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
