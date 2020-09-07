package ru.mirea.inbo0519.pr1;

public class Book
{
    private String author;
    private int page_number;

    public Book(String author, int page_number)
    {
        this.author = author;
        this.page_number = page_number;
    }

    public Book(String author)
    {
        this.author = author;
        this.page_number = 100;
    }
    public Book()
    {
        this.author = "Unknown";
        this.page_number = 100;
    }
    public void setPageNumber(int page_number)
    {
        this.page_number = page_number;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getPageNumber()
    {
        return page_number;
    }
    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString()
    {
        return author + ", page_number " + page_number;
    }

    public int intoChapters()
    {
        return page_number / 20;
    }
}
