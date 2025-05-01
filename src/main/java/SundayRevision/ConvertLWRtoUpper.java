package SundayRevision;

public class ConvertLWRtoUpper {

	public static void main(String[] args) {
		String Arr[] = { "Codemind" };

		for (int i = 0; i < Arr.length; i++) {

			String S1 = Arr[i].replace('d', 'D');

			System.out.println(S1);
		}
	}
}
