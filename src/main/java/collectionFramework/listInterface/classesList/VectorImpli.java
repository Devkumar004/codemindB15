package collectionFramework.listInterface.classesList;

import java.util.Vector;

public class VectorImpli {

		public static void main(String[] args) {

			Vector<Integer> L = new Vector<Integer>();

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


