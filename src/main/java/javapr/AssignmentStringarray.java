package javapr;

public class AssignmentStringarray {

	public static void main(String[] args) {
		String arr[] = { " Welcome to CodeMind Technology " };

		int countW = 0;
		int counte = 0;
		int countl = 0;
		int countc = 0;
		int counto = 0;
		int countm = 0;
		int countt = 0;
		int countC = 0;
		int countd = 0;
		int countM = 0;
		int counti = 0;
		int countn = 0;
		int countT = 0;
		int counth = 0;
		int countg = 0;
		int county = 0;

	for (int i = 0; i < arr[0].length(); i++) {
			if (arr[0].charAt(i) == 'W') {
				countW++;
			}
			if (arr[0].charAt(i) == 'e') {
				counte++;
			}
			if (arr[0].charAt(i) == 'l') {
				countl++;
			}
			if (arr[0].charAt(i) == 'c') {
				countc++;
			}
			if (arr[0].charAt(i) == 'o') {
				counto++;
			}
			if (arr[0].charAt(i) == 'm') {
				countm++;
			}
			if (arr[0].charAt(i) == 't') {
				countt++;
			}
			if (arr[0].charAt(i) == 'C') {
				countC++;
			}
			if (arr[0].charAt(i) == 'd') {
				countd++;
			}
			if (arr[0].charAt(i) == 'M') {
				countM++;
			}
			if (arr[0].charAt(i) == 'i') {
				counti++;
			}
			if (arr[0].charAt(i) == 'n') {
				countn++;
			}
			if (arr[0].charAt(i) == 'T') {
				countT++;
			}
			if (arr[0].charAt(i) == 'h') {
				counth++;
			}
			if (arr[0].charAt(i) == 'g') {
				countg++;
			}
			if (arr[0].charAt(i) == 'y') {
				county++;
		}
		}
		System.out.println("Character count of 'W' is :  " + countW);
		System.out.println("Character count of 'e' is  :  " + counte);
		System.out.println("Character count of 'l' is   :  " + countl);
		System.out.println("Character count of 'c' is  :  " + countc);
		System.out.println("Character count of 'o' is  :  " + counto);
		System.out.println("Character count of 'm' is :  " + countm);
		System.out.println("Character count of 't' is   :  " + countt);
		System.out.println("Character count of 'C' is  :  " + countC);
		System.out.println("Character count of 'd' is  :  " + countd);
		System.out.println("Character count of 'M' is :  " + countM);
		System.out.println("Character count of 'i' is   :  " + counti);
		System.out.println("Character count of 'n' is  :  " + countn);
		System.out.println("Character count of 'T' is  :  " + countT);
		System.out.println("Character count of 'h' is  :  " + counth);
		System.out.println("Character count of 'g' is  :  " + countg);
		System.out.println("Character count of 'y' is  :  " + county);
		

	}
}
