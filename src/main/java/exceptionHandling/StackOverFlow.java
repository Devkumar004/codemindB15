package exceptionHandling;
public class StackOverFlow {

	public static void stackOverflowError() {
		stackOverflowError();
	}

	public static void main(String[] args) {
		System.out.println("'This is the example of StackOverFlow Error'");
		stackOverflowError();
		
	}
}
