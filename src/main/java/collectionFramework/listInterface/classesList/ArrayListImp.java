package collectionFramework.listInterface.classesList;

import java.util.ArrayList;

public class ArrayListImp {

	public static void main(String[] args) {
		
		/* ArrayList: ******************************************************************
		--> ArrayList is an implementation class of list interface.
		--> ArrayList allows duplicate elements.
		--> ArrayList maintain insertion order
		--> ArrayList dynamic array as data structure at a backend.
		--> ArrayList is non synchronized hence it is non thread safe.
		--> ArrayList is used when we want faster access of elements.
		--> ArrayList allows null insertion.*/
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(null);
		arrayList.add(100);
	
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}

}
