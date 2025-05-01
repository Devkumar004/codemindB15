package runTimeException;

import exceptionHandling.RunTimeExceptionEx;

public class ArithmeticExceptionEx {
	public int div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		
		RunTimeExceptionEx R = new RunTimeExceptionEx();
		System.out.println("Division = " + R.div(100, 0));
	}
}
