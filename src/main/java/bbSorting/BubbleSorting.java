package bbSorting;

public class BubbleSorting {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 60, 90, 80, 55 };

		int i = 0;
		int j = i + 1;
		int temp = 0;
		while (i < arr.length) {
			while (j < arr.length) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[j] = arr[j];
					arr[j] = temp;
				}
				i++;
			}
			j++;
			System.out.println(arr[i]);
		}
		
	}
}