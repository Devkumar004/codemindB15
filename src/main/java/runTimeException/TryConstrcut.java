package runTimeException;

import javax.annotation.processing.FilerException;

public class TryConstrcut {
	int result = 0;

	public int div(int a, int b) {

		try {
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Please do not try to divide by zero");
		} catch (NullPointerException e) {
			System.out.println("Null pointer Please do not try to divide by zero");
		} catch (RuntimeException e) {
			System.out.println("Runtime Please do not try to divide by zero");
		}

		System.out.println(result);
		return result;
	}

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {

		TryConstrcut T = new TryConstrcut();
		T.div(10, 0);
		T.add(10, 55);
	
	}
}
