package ru.mirea.pr5;

import java.util.Scanner;

public class Number_6
{
    public boolean checkPrime(int n, int denominator)
    {
        if (n % 2 == 0)
            return false;
        if (n % denominator == 0)
            return false;
        if (denominator * 2 > n)
            return true;
        return checkPrime(n, denominator + 2);
    }

    public static void main(String[] args)
    {
        System.out.print("Введите натуральное число > 1: ");
        Scanner in = new Scanner(System.in);
        Number_6 ex = new Number_6();
        if (ex.checkPrime(in.nextInt(), 3))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
