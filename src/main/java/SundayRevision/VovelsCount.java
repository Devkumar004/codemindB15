package SundayRevision;

public class VovelsCount {

	public static void main(String[] args) {
		char Str[] = { 'a', 'e', 'i', 'o', 'u' };

		int counta = 0;
		int counte = 0;
		int counti = 0;
		int counto = 0;
		int countu = 0;

		for (int i = 0; i < Str.length; i++) {

			if (Str[i] == 'a') {
				counta++;
			}
			if (Str[i] == 'e') {
				counte++;
			}
			if (Str[i] == 'i') {
				counti++;
			}
			if (Str[i] == 'o') {
				counto++;
			}
			if (Str[i] == 'u') {
				countu++;
			}		
		}
		System.out.println("Count of 'a' is : " + counta);
		System.out.println("Count of 'e' is : " + counta);
		System.out.println("Count of 'i' is : " + counta);
		System.out.println("Count of 'o' is : " + counta);
		System.out.println("Count of 'u' is : " + counta);
	}
}
