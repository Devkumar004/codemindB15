package collectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpli {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(5);
		set.add(20);
		set.add(10);
		set.add(100);

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
