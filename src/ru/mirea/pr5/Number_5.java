package ru.mirea.pr5;

import java.util.Scanner;

public class Number_5
{
    public int digitsSum(int n)
    {
        if (n == 0)
            return 0;
        else
            return n % 10 + digitsSum(n / 10);
    }

    public static void main(String[] args)
    {
        System.out.print("Введите N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Number_5 ex = new Number_5();
        System.out.println(ex.digitsSum(n));
    }
}
