package DayEight;


//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Scanner;

class Solution{

    public static void main(String []argh){
        HashMap<String, Integer> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            Integer number = phoneBook.get(s);
            if (number != null) {
                System.out.println(s + "=" + number);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

