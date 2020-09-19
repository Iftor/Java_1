package ru.mirea.pr5;

import java.util.Scanner;

public class Number_2
{
    public void outputToN(int N, int n)
    {
        System.out.print(n + " ");
        if (n != N)
            outputToN(N, n + 1);
    }

    public static void main(String[] args)
    {
        Number_2 ex = new Number_2();
        System.out.print("Введите n: ");
        Scanner in = new Scanner(System.in);
        ex.outputToN(in.nextInt(), 1);
    }
}
