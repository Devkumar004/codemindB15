package MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapImpl {

	public static void main(String[] args) {

		LinkedHashMap<Long, String> map = new LinkedHashMap<Long, String>();

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

		}
	}

}
