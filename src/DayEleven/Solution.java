package DayEleven;

import java.util.Scanner;

public class Solution {

    public static int calcHourglassSum(int indexRow, int indexColumn, int[][] array) {
        int sum = 0;
        // top and bottom rows
        for (int i = 0; i < 3; i++) {
            sum += array[indexRow][indexColumn + i];
            sum += array[indexRow + 2][indexColumn + i];
        }
        // middle row
        sum += array[indexRow + 1][indexColumn + 1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        // the smallest possible hourglass
        int largestHourglass = -63;

        // iterate through hourglasses top left most indexes
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int hourglassSum = calcHourglassSum(row, column, arr);
                if (hourglassSum > largestHourglass) {
                    largestHourglass = hourglassSum;
                }
            }
        }

        System.out.println(largestHourglass);
    }
}
