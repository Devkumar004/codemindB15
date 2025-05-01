package collectionFramework;

import java.util.Arrays;
import java.util.Collections;

public class WrapperClsArray {
	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println("Element at index 2: " + arr[2]);

		Integer max = Collections.max(Arrays.asList(arr));
		Integer min = Collections.min(Arrays.asList(arr));
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("descending order: " + Arrays.toString(arr));
	}
}
