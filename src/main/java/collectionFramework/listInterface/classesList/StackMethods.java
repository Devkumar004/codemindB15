package collectionFramework.listInterface.classesList;

import java.util.Iterator;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {

		Stack<Integer> L = new Stack<Integer>();

		L.add(10);
		L.add(20);
		L.add(30);
		L.add(10);
		L.add(null);

		Stack<Integer> L1 = new Stack<>();

		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(10);

		// When i have to join both array.
		System.out.println("_______________________________________________");
		L.addAll(L1);
		System.out.println("Append array : " + L);
		System.out.println("_____________________________________________");
		System.out.println("To find size of array : " + L.size());
		System.out.println("_____________________________________________");
		System.out.println("To check the content in array : " + L.contains(15));
		System.out.println("To check the content in array : " + L.contains(10));
		System.out.println("_____________________________________________");
		System.out.println("To check the elements in L and L1array : " + L.containsAll(L));
		System.out.println("To check the elements in L and L1array : " + L.containsAll(L1));
		System.out.println("_____________________________________________");
		System.out.println("To get the element in array : " + L.get(3));// Mostly used.
		System.out.println("____________________________________________");
		System.out.println("To find the index of element : " + L.indexOf(60));
		System.out.println("_____________________________________________");
		System.out.println("To know the given array is empty or not : " + L.isEmpty());
		System.out.println("_____________________________________________");

		System.out.println("To make Duplicate of existing array : " + L.clone());
		System.out.println("_____________________________________________");
		System.out.println("To remove the element of perticular index : " + L.remove(2) + " " + L);
		System.out.println("_____________________________________________");

		System.out.println("_____________________________________________");

		System.out.println("view of the list from index 1 (inclusive) to index 3 (exclusive) : " + L.subList(1, 3));
		System.out.println("_____________________________________________");
		Iterator<Integer> iterator = L.iterator();

		while (iterator.hasNext()) {
			System.out.println("print the array : " + iterator.next());
		}
		/*
		 * System.out.println("_____________________________________________");
		 * Stack<String> l11 = new Stack<String>(Arrays.asList("Sachin", "Saurav",
		 * "hardik"));
		 * System.out.println("Output when removed one element using object : " +
		 * l11.remove("hardik") + "  " + l11);
		 */
	}

}
