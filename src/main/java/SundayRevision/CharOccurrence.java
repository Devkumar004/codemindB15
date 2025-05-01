package SundayRevision;

public class CharOccurrence {

	public static void main(String[] args) {

		String Arr[] = { "Codemind" };

		int Countd = 0;

		for (int i = 0; i < Arr[0].length(); i++) {
			if (Arr[0].charAt(i) == 'd') {
				Countd++;
			}
		}
		System.out.println("Count of 'd' is : " + Countd);
	}
}