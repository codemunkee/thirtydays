package DayTwo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        System.out.println("Hi russ");

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int foo;
        double  bar;
        String baz;

        /* Read and save an integer, double, and String to your variables.*/
        foo = scan.nextInt();
        bar = scan.nextDouble();
        scan.nextLine();
        baz = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + foo);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + bar);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + baz);

    }
}
