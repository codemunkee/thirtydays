package DayOne;

import java.util.Scanner;

/**
 * Created by rnealis on 12/21/16.
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

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
