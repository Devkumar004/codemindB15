package collectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCharactics {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(5);
		set.add(20);
		set.add(10);
		set.add(100);
		set.add(null);

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
