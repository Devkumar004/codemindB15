package javapr;

public class ArrayProgram {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 2, 100, 200, 50, 30 };
		int i, j;

		// Print array
		System.out.println("#Original array:");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Print array after sorting in Ascending Order

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		System.out.println();
		System.out.println("#Array in Ascending Order :");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			

		}
		System.out.println();
		// Print array after sorting in Descending Order

		int arr1[] = { 5, 10, 2, 100, 200, 50, 30 };

		for (i = 0; i < arr1.length - 1; i++) {
			for (j = i + 1; j < arr1.length; j++) {
				if (arr1[i] < arr1[j]) {

					int c = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = c;
				}
			}
		}

		System.out.println("#Array in Descending Order :");
		for (i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);

		}
	
		// Print Min. & Max from array.
		System.out.println();

		System.out.println(" #Print Min. & Max from array.");
		System.out.println("Min = " + arr[0]);
		System.out.println("Max = " + arr[arr.length - 1]);
		System.out.println();

		// Print 2nd Min & 2nd Max from array.
		System.out.println(" #Print 2nd Min & 2nd Max from array.");
		System.out.println("2nd Min number is = " + arr[1]);
		System.out.println("2nd Max number is = " + arr[arr.length - 2]);

	}
}
