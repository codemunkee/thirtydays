import java.util.Scanner;

public class DaySixteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;

        try {
            N = scan.nextInt();
            System.out.println(N);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
