package javapr;

public class StringisImmutable {
	String S = "DK";

	public static void main(String[] args) {
		StringisImmutable AS = new StringisImmutable();
		
		AS.S = "Rahul";

	//	System.out.println(AS.S);
		
		 System.out.println(AS.S.hashCode());
		 }

}
