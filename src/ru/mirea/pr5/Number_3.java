package ru.mirea.pr5;

import java.util.Scanner;

public class Number_3
{
    public void outputFromAToB(int a, int b)
    {
        System.out.print(a + " ");
        if (a > b)
            outputFromAToB(a - 1, b);
        else if (a < b)
            outputFromAToB(a + 1, b);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = in.nextInt();
        System.out.print("Введите B: ");
        int b = in.nextInt();
        Number_3 ex = new Number_3();
        ex.outputFromAToB(a, b);
    }
}
