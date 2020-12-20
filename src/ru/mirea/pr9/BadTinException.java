package ru.mirea.pr9;

public class BadTinException extends RuntimeException
{
    public BadTinException(String errorMessage, Throwable err)
    {
        super(errorMessage, err);
    }
}
