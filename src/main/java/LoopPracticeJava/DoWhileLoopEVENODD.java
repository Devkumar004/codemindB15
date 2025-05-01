package LoopPracticeJava;

 class DoWhileLoopEVENODD {

	public static void main(String[] args) {

		int i = 0;
		
		do {
			if (i % 2 == 0) {
				System.out.println(i + " : number is even number");
			}
			else {
				System.out.println(i+ " : number is odd number");
			}
			i++;
		}
		while (i <= 10);
	}
}