package StringPrograms;

public class StringProgram {

	public static void main(String[] args) {

		String S = "Welcome to codemind";
		for (int i = S.length() - 1; i >= 0; i--) {
			System.out.print(S.charAt(i));
		}
		String SS1 = "ABAB";
		int count = 0; // Reset count to 0 at the start

		// Loop through each character in the string
		for (int i = 0; i < SS1.length(); i++) {
			// Loop through each subsequent character to compare with the character at index
			// i
			for (int j = i + 1; j < SS1.length(); j++) {
				if (SS1.charAt(i) == SS1.charAt(j)) {
					count++; // Increment count when there's a match
				}
			}
			System.out.println(SS1.charAt(i) + " = " + count); // Print the character and its count
			count = 0; // Reset count for the next character
		}
	}

}
