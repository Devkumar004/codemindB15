package collectionFramework.listInterface.classesList;

import java.util.Stack;

public class StackImpli {

		public static void main(String[] args) {

			Stack<Integer> L = new Stack<Integer>();

			L.add(10);
			L.add(20);
			L.add(30);
			L.add(10);
			L.add(null);
			
			for(int i=0; i<L.size(); i++) {
				System.out.println( L.get(i));
			}
	
		
		}
	}


