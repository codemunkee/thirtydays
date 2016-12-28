package DaySix;

import java.util.Scanner;

/**
 * Created by rnealis on 12/27/16.
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        // the number of words we're going to get
        int T = scan.nextInt();

        String[] words = new String[T];

        for (int i = 0; i < T; i++) {
            words[i] = scan.next();
        }

        for (String word: words) {
            char[] chars = word.toCharArray();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < chars.length; i++) {
                if ((i + 1) % 2 == 0) {
                    even.append(chars[i]);
                } else {
                    odd.append(chars[i]);
                }
            }

            System.out.println(odd + " " + even);
        }
    }
}
