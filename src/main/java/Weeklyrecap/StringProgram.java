package Weeklyrecap;

import java.util.Arrays;

public class StringProgram {

	public static void main(String[] args) {
//Print 0 at last.
		int num[] = { 10, 55, 63, 0, 8, 9, 5, 0, 78, 65, 0, 55 };

		for (int i = num.length - 1; i >= 0; i--) {
			Arrays.sort(num);

			System.out.println(num[i]);
		}
	}
}
