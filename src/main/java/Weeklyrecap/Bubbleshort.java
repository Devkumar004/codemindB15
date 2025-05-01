package Weeklyrecap;

public class Bubbleshort {
    public static void main(String[] args) {
        int Num[] = { 10, 55, 63, 0, 8, 9, 5, 0, 78, 65, 0, 55 };

        // Bubble Sort
        for (int i = 0; i < Num.length - 1; i++) {
            for (int j = 0; j < Num.length - 1 - i; j++) {
                if (Num[j] > Num[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = Num[j];
                    Num[j] = Num[j + 1];
                    Num[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        for (int num : Num) {
            System.out.print(num + " ");
        }
    }
}
