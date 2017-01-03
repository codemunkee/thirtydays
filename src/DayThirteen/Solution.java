package DayThirteen;

abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price ) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution {

    public static void main(String[] args) {
        MyBook satori = new MyBook("Satori", "Don Winslow", 10);
        satori.display();
    }
}
