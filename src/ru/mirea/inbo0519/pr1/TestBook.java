package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Dostoevsky", 1008);
        Book b2 = new Book("Sapkovsky", 400);
        Book b3 = new Book("Azimov");
        b3.setPageNumber(350);
        System.out.println(b1);
        System.out.println(b1.intoChapters());
        System.out.println(b2.intoChapters());
        System.out.println(b3.intoChapters());
    }
}
