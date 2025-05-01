package String;

public class HalfOfString {

	public static void main(String[] args) {

		String Str = "I LOVE INDIA";

		for (int i = (Str.length() / 2)+1; i < Str.length(); i++) {
			
			System.out.println(Str.charAt(i));

		}

	}

}
