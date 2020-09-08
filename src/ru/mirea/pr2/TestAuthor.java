package ru.mirea.pr2;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author author = new Author("Nabokov", "chield_moe_lasster@mirea.ru", 'M');
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
        System.out.print(author);
    }
}
