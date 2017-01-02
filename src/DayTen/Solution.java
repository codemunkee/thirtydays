package DayTen;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int original = scan.nextInt();
        String inBinary = Integer.toBinaryString(original);
        char[] digits = inBinary.toCharArray();

        int maxOnes = 0;
        boolean lastOne = false;

        for (char digit: digits) {
            if (digit == '1') {
                if (lastOne) {
                    maxOnes += 1;
                } else if (maxOnes < 1) {
                    lastOne = true;
                    maxOnes = 1;
                }
            } else {
                lastOne = false;
            }
        }

        System.out.println(maxOnes);
    }
}
