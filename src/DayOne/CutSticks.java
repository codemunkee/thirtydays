package DayOne;

import java.util.Scanner;

/**
 * Created by rnealis on 12/21/16.
 * https://www.hackerrank.com/challenges/cut-the-sticks?h_r=next-challenge&h_v=zen
 */



public class CutSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        cutIt(arr);
    }

    private static void cutIt(int[] numbers) {

        int shortestStick = 1000;
        int longestStick = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > longestStick) {
                longestStick = numbers[i];
            }

            if(numbers[i] < shortestStick) {
                shortestStick = numbers[i];
            }
        }

        System.out.println(longestStick - shortestStick);



    }
}
