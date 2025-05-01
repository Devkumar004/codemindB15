package weeklyRecap20;

import java.io.File;

class A {
	void show() {
		//File f = new File(C:\Users\hp\Downloads\SmartConnect);

	}
	public class ExceptionEx {

		public static void main(String[] args) {
			int arr[] = { 10, 20, 30 };
			try {
				System.out.println("before exception");
			//	System.out.println(arr[10]);
				throw new ArrayIndexOutOfBoundsException();
				//System.out.println("After exception");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("After try block");
	
			}
		}
	}

