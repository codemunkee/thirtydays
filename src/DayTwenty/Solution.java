package DayTwenty;

import java.util.Scanner;

/**
 * Created by rnealis on 1/10/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] elements = new int[scan.nextInt()];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scan.nextInt();
        }

        int totalSwaps = 0;
        boolean sorted = false;

        do {
            int swaps = 0;

            for (int j = 0; j < elements.length; j++) {
                if (j < elements.length - 1) {
                    if (elements[j] > elements[j + 1]) {
                        int temp = elements[j];
                        elements[j] = elements[j + 1];
                        elements[j + 1] = temp;
                        totalSwaps += 1;
                        swaps += 1;
                    }
                }
            }
            if (swaps == 0) {
                sorted = true;
            }
        } while (!sorted);

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + elements[0]);
        System.out.println("Last Element: " + elements[elements.length - 1]);

    }

}
