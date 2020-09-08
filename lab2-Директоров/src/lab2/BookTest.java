package lab2;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book ("Stephen King", "It", 1986);
        System.out.println("Первая книга: "+b.getAuthor()+" "+b.getName()+" "+b.getYear());
        b.setName("The Dark Tower VII: The Dark Tower");
        b.setYear(2004);
        System.out.println("Вторая книга: "+b.getAuthor()+" "+b.getName()+" "+b.getYear());
    }
}
