package Weeklyrecap;

public class StringIMPProgram {

	public static void main(String[] args) {
		/*
		 * String str = "In123458di@#$%%^123a"; int count = 0; //convert to upper case
		 * 
		 * for (int i = 0; i <str.length(); i++) {
		 * System.out.println(Character.toUpperCase(str.charAt(i)));
		 * 
		 * //lower case System.out.println(Character.toLowerCase(str.charAt(i))); }
		 * 
		 * // count digits only in string
		 * 
		 * for (int i = 0; i < str.length(); i++) { if
		 * (Character.isDigit(str.charAt(i))) {
		 * 
		 * count = count + 1; } } System.out.println("Digit count: " + count);
		 */
		
		
		// Remove The spaces and print the string.

		String str = "India is my country !";
 
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.print(str.charAt(i));
			}
		}
	}
}