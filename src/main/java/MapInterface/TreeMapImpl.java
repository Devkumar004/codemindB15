package MapInterface;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Long, String> map = new TreeMap<Long, String>();

		map.put(3443523789671L, "Rahul");
		map.put(544352378951L, "Virat");
		map.put(444464444444L, "Rahul");
	//	map.put(null, null); single null key is not allowed here
		map.put(644464444444L, null);

		Set<Entry<Long, String>> set = map.entrySet();
		Iterator<Entry<Long, String>> it = set.iterator(); // FIXED: colon to semicolon

		while (it.hasNext()) {
			Entry<Long, String> ee = it.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());

		}
		// class cast exception
		TreeMap tmap= new TreeMap();
		
		map.put(3443523789671L, "Rahul");
		map.put(544352378951L, "Virat");
		map.put(444464444444L, "Rahul");
	}
}
