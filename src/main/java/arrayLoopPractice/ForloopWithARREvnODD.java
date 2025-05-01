package arrayLoopPractice;

public class ForloopWithARREvnODD {
	public static void main(String[] args) {

		int Num[] = { 10, 12, 14, 55, 63, 5531 };

		for (int i = 0; i < Num.length; i++) {
			if (Num[i] % 2 == 0) {
				System.out.println(Num[i] + " : is even number");
			} else {
				System.out.println(Num[i] + " : is odd number");
			}
		}
	}
}
