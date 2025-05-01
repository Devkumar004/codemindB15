package collectionFramework.SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetMethods {
	public static void main(String[] args) {
		LinkedHashSet<Integer> L = new LinkedHashSet<Integer>();

		L.add(10);
		L.add(20);
		L.add(30);

		LinkedHashSet<Integer> L1 = new LinkedHashSet<Integer>();

		L1.add(40);
		L1.add(50);
		L1.add(60);

		System.out.println("Single array : " + L);
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

		System.out.println("____________________________________________");

		System.out.println("_____________________________________________");
		System.out.println("To know the given array is empty or not : " + L.isEmpty()); 
		System.out.println("_____________________________________________");

		System.out.println("To make Duplicate of existing array : " + L.clone());
		System.out.println("_____________________________________________");
		System.out.println("To remove the element of perticular index : " + L.remove(2) + " " + L);
		System.out.println("_____________________________________________");

		System.out.println("_____________________________________________");

		System.out.println("_____________________________________________");
		Iterator<Integer> iterator = L.iterator();

		while (iterator.hasNext()) {
			System.out.println("print the array : " + iterator.next());
		}
		System.out.println("_____________________________________________");
		List<String> l11 = new ArrayList<String>(Arrays.asList("Sachin", "Saurav", "hardik"));
		System.out.println("Output when removed one element using object : " + l11.remove("hardik") + "  " + l11);
	}

}
