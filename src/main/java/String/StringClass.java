package String;

public class StringClass {

	public static void main(String[] args) {

		String S = "Welcome to codemind";
	//	System.out.println("Char at specified index is : " + S.charAt(5));
		System.out.println(S.charAt(2));
	//	System.out.println(S.concat(" technology"));
System.out.println(S.concat(" Pune"));
		//System.out.println("Bool"+S.compareTo("technology"));
System.out.println(S.compareTo("Welcome"));
		System.out.println(S.compareTo("Welcome to codemind"));
		System.out.println("Bool"+S.compareTo("Technology"));
		System.out.println(S.compareToIgnoreCase("welcome to codemind"));

		System.out.println(S.contains(" to"));
		System.out.println(S.endsWith("codemind"));
		System.out.println(S.equals("Welcome to codemind"));

		System.out.println(S.equalsIgnoreCase("welcome to Codemind"));
		System.out.println(S.indexOf("codemind"));
		System.out.println(S.indexOf("c"));

		System.out.println(" ".indexOf(0));
		System.out.println(S.isBlank());

		System.out.println(S.isEmpty());
		System.out.println(S.lastIndexOf('m'));
		System.out.println(S.length());
		System.out.println(S.replace('d', 'D'));
		System.out.println(S.replace("co", "CO"));

		String SS = "11FDG$%gjhhklh324";
		System.out.println(SS.replaceAll("[FD]", "99"));
		System.out.println(SS.replaceAll("[0-9]", " "));
		System.out.println(SS.replaceAll("[^0-9]", ""));
		System.out.println("Rejex "+SS.replaceFirst("FD", "99"));

		System.out.println(SS.split(" "));
		// for else

		// Reverse words from given string.

		String arr[] = S.split(" ");
		for (String S1 : arr) {
			for (int i = SS.length() - 1; i >= 0; i--) {
				System.out.print(SS.charAt(i));
			}
			System.out.println(" ");
		}

		String S1 = "1233%4sfDDFHHHLLJ$%&%$";

		System.out.println(S1.replaceAll("[0-9]", " "));

		System.out.println(S1.replaceAll("[A-Z]", ""));
		System.out.println(S1.replaceAll("[^0-9]", ""));
		System.out.println(S1.replaceAll("[^0-9a-zA-Z]", ""));
	}

}

class StringEx{
	/**
	 * String can be declare by two ways
	 * 1 String literal>>>> String S="Work";
	 * 									String Y="Work";
	 * 2. New keyword>>> String S = new String(Work);
	 */
	
}
