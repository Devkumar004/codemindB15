package collectionFramework.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListCharacteristics {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(40);
		list.add(20);
		list.add(9);
		list.add(null);
		list.add(40);

		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println();
		List<Character> lCharacters = new ArrayList<Character>();
		lCharacters.add('C');
		lCharacters.add('o');
		lCharacters.add('d');
		lCharacters.add('e');
		lCharacters.add('m');
		lCharacters.add('i');
		lCharacters.add('n');
		lCharacters.add('d');
		// lCharacters.add(null);
		for (Character j : lCharacters) {
			System.out.print(j);
		}

	}
}
