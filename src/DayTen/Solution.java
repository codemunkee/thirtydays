package DayTen;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int original = scan.nextInt();
        String inBinary = Integer.toBinaryString(original);
        char[] digits = inBinary.toCharArray();

        int maxOnes = 0;
        int consOnes = 0;

        for (char digit: digits) {
            if (digit == '1') {
                consOnes += 1;

                if (consOnes > maxOnes) {
                    maxOnes = consOnes;
                }

            } else {
                consOnes = 0;
            }
        }

        System.out.println(maxOnes);
    }
}
