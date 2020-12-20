package ru.mirea.pr9;
import java.util.Scanner;

public class Number_1
{
    public static void main(String[] args)
    {
        Scanner getTin = new Scanner(System.in);
        String tin = "";
        try {
            tin = getTin.next();
            Integer.parseInt(tin);
            if (tin.length() != 12)
                throw new Exception();
        } catch (NumberFormatException err)
        {
            throw new BadTinException("Incorrect TIN symbols: " + tin, err);
        } catch (Exception err)
        {
            throw new BadTinException("Incorrect TIN length: " + tin.length(), err);
        }
    }
}
