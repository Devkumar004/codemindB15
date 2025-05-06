package practice;

public class BBsorthing {
	public static void main(String[] args) {
		int temp = 0;
		int s[] = { 122, 102, 34, 22 };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] >s[j]) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			System.out.println(s[i]);
		}

	}
}
