package collectionFramework.listInterface.classesList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpli {

	public static void main(String[] args) {
			LinkedList<Integer> set = new LinkedList<Integer>();

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
