package arrayLoopPractice;

public class DoWhileArray {
	public static void main(String[] args) {

		int Num[] = { 10, 12, 14, 55, 63, 5531, 22 };

		int i = 0;
		do {
			System.out.println("Output is : " + Num[i]);
			i++;
		} while (i < Num.length);
	}
}
