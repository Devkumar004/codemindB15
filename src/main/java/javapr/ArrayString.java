package javapr;

public class ArrayString {
	
	String S="DK";

	public static void main(String[]args) {
		
	
		
		
		ArrayString AS = new ArrayString();
	/*	int B=10;
		String A ="Rahul";
		String S = new String("Sachin");
		String SS = new String("Sachin");
		
		System.out.println(A);
		System.out.println(S);
		System.out.println(SS);
		
		System.out.println(A.hashCode());
		
		String SSS= "Rahul";
		
		System.out.println(SSS.hashCode());
		
	
		
	String D = "DK";   //String is immutable.
	String DD =D.concat(" YM");
	
	System.out.println(DD);
		*/
		
	AS.S="Rahul";
	
	System.out.println(AS.S);
	
	/*
	String str1 ="Rutuja";
	System.out.println(str1.hashCode());
	String str2 ="Rutuja";
	System.out.println(str2.hashCode());
	String str3 ="Rutuja";
	System.out.println(str3.hashCode());
	
	*/
	
	
	
	System.out.println();
	
	String SS="              Welcome to codemind";
	
	System.out.println(SS.substring(0,7));

	char Arr[]=SS.toCharArray();
	for (char c: Arr) {
		System.out.println(SS);
	}
	
	System.out.println("trim" +SS.trim());// remove starting and ending spaceses
	//int AA=10;
	String SSS =String.valueOf(10);
	System.out.println(SSS.length());
	
	
	
	
	}
	
}
