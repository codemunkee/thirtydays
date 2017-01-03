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

    MyBook(String title, String author) {
        super(title, author);
    }

    public void display() {
        System.out.println("Hello World");
    }
}

public class Solution {
}
