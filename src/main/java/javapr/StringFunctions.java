package javapr;

public class StringFunctions {
	public static void main(String[] args) {

//	1. char charAt(int index) :-> It returns char value for the particular index  

		String str = "Welcome to codemind technologies";

		for (int i = 0; i < str.length(); i++) {
		}
		System.out.println("CharAt : " + str.charAt(2));

		// 2. int length() :-> It returns string length
		System.out.println();
		System.out.println("String Length : " + str.length());
		System.out.println();
		// 3. String substring(int beginIndex) :-> It returns substring for given begin
		// index

		System.out.println("Substring for  begin index : " + str.substring(1));
		System.out.println();
		// 4. String substring(int beginIndex, int endIndex) :-> It returns substring
		// for given begin index and end index.

		System.out.println("Substring for begin index and end index : " + str.substring(0, 7));
		System.out.println();

		// 5. boolean contains(CharSequence s) :-> It returns true or false after
		// matching the sequence of char value

		System.out.println("Boolean contains(CharSequence s) : " + str.contentEquals("come"));

		// 6. boolean equals(Object another) :-> It checks the equality of string with
		// the given object.
		System.out.println();
		System.out.println("Boolean equals(Object another : " + str.equals("Welcome to codemind technologies"));

		// 7. String concat(String str) :-> It concatenates the specified string.
		System.out.println();
		System.out.println("Concat : " + str.concat(" Pune."));

		// 8. String replace(char old, char new) :-> It replaces all occurrences of the
		// specified char value
		System.out.println();
		System.out.println("Replace Char : " + str.replace('d', 'D'));
		System.out.println();
		System.out.println("Replace ALL Char : " + str.replaceAll("mind", "kind"));
		System.out.println();
		// 9. String replace(CharSequence old, CharSequence new) :-> It replaces all
		// occurrences of the specified CharSequence.
		System.out.println(str.replaceFirst("String replace(CharSequence old, CharSequence new): " + "come", "dome"));

		// 10. boolean String equalsIgnoreCase(String another) :-> It compares another
		// string. It doesn't check case.
		System.out.println();
		System.out.println("Boolean String equalsIgnoreCase(String another) : "
				+ str.equalsIgnoreCase("welcome to codemind technologies"));

		// 11. String[] split(String regex) :-> It returns a split string matching
		// regex.

		String[] words = str.split(" "); // Split by space
		for (String word : words) {
		    System.out.println("String[] split(String regex) : "+word);
		}
		
		//12. String toLowerCase() :-> It returns a string in lowercase.  
		System.out.println();
		System.out.println("String toLowerCase: "+str.toLowerCase());
		
		//13. String toUpperCase() :-> It returns a string in uppercase.
		System.out.println();
		System.out.println(str.toUpperCase());
		}
	}

