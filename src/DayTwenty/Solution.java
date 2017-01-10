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

        while (!sorted) {
            int currentSwaps = 0;

            for (int j = 0; j < elements.length; j++) {
                if (j < elements.length - 2) {
                    if (elements[j] > elements[j + 1]) {
                        int temp = elements[j];
                        elements[j] = elements[j + 1];
                        elements[j + 1] = temp;
                        totalSwaps += 1;
                        currentSwaps += 1;
                    }
                }
            }
            if (currentSwaps == 0) {
                sorted = true;
            }
        }

        for (int element: elements) {
            System.out.print(element);
        }
        System.out.println("Total Swaps: " + totalSwaps);

    }

}
