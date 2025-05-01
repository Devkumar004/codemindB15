package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapMethods {

	public static void main(String[] args) {
		HashMap<Long, String> map = new HashMap<Long, String>();

		map.put(3443523789671L, "Rahul");
		map.put(444415454555L, "Sunil");
		map.put(344352378951L, "Virat");
		map.put(444464444444L, "Rahul");
		map.put(444464444444L, null);
		System.out.println(map);
		HashMap<Long, String> map2 = new HashMap<Long, String>();
		map2.put(146464644444L, "Ravindra");
		// Methods
		map.putAll(map2);// append the value
		System.out.println(map);
		System.out.println("***********************************************************");
		System.out.println("  TO check the contains key :  " + map.containsKey(3443523789671L));// TO check the contains
																								// key.
		System.out.println("***********************************************************");
		System.out.println(" To check contains value : " + map.containsValue("Ravindra"));
		System.out.println("***********************************************************");
		System.out.println("To print the value belongs to key : " + map.get(344352378951L));

		System.out.println("***********************************************************");

		System.out.println("to check the map is empty or not : " + map.isEmpty());

		System.out.println("***********************************************************");
		// To write the Key set.
		Set<Long> keySet = map.keySet();
		for (Long L : keySet) {
			System.out.println(L);
		}
		System.out.println("***********************************************************");
		System.out.println(" To remove keys : " + map.remove(3443523789671L) + map);

		System.out.println("***********************************************************");

		System.out.println("To replace a value or key : " + map.replace(344352378951L, "krunal") + map);
		System.out.println("***********************************************************");

		System.out.println("To get number of entries : " + map.size());
		System.out.println("***********************************************************");
		// To write the Value set.
		Collection<String> values = map.values();
		Iterator<String> it4 = values.iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());
		}
		System.out.println("***********************************************************");
		map.clear();
		System.out.println("To clear the map : " + map);
	}
}
