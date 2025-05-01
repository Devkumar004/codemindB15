package javapr;

import java.util.Arrays;

public class ArrayProgramwithSort {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 2, 100, 200, 50, 30 };
		int i;

		// Print array
		System.out.println("#Original array:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("#Ascending array:");

		// Print array after sorting in Ascending Order
		Arrays.sort(arr);
		for (i = 0; i<=arr.length - 1; i++)
			System.out.println(arr[i]);

	System.out.println();
	System.out.println("#Descending array:");

	// Print array after sorting in Descending Order
	Arrays.sort(arr);
	for (i = arr.length-1; i>=0; i--)
		System.out.println(arr[i]);
}
}


/*

 * // Print Min. & Max from array. System.out.println();
 * 
 * System.out.println(" #Print Min. & Max from array.");
 * System.out.println("Min = " + arr[0]); 
 * System.out.println("Max = " +arr[arr.length - 1]); System.out.println();
 * 
 * // Print 2nd Min & 2nd Max from array.
 * System.out.println(" #Print 2nd Min & 2nd Max from array.");
 * System.out.println("2nd Min number is = " + arr[1]);
 * System.out.println("2nd Max number is = " + arr[arr.length - 2]);
 * 
 * } }
 * 
 * }
 */