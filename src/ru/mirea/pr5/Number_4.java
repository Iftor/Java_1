package ru.mirea.pr5;

import java.util.Scanner;

public class Number_4
{
    public int numbersAmount(int k, int s, int number) //работает только с k = 3, иначе стек переполняется
    {
//        int sum = 0;
//        int numberCopy = number;
//        while (numberCopy != 0)
//        {
//            sum += numberCopy % 10;
//            numberCopy /= 10;
//        }
//        if (sum == s)
//            return 1;
//        else if (sum > s)
//            return 0;
//        sum = 0;
//        for (int i = 0; i < 10; ++i)
//            sum += numbersAmount(k, s, number + i * (int) Math.pow(10, order), order + 1);
//        return sum;

        if ((int) Math.log10(number) + 1 > k)
            return 0;
        else if (number / Math.pow(10, k) == s)
            return 1;
        int sum = 0;
        int numberCopy = number;
        while (numberCopy != 0)
        {
            sum += numberCopy % 10;
            numberCopy /= 10;
        }
        if (sum == s)
            return 1 + numbersAmount(k, s, number + 1);
        else
            return numbersAmount(k, s, number + 1);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите k: ");
        int k = in.nextInt();
        System.out.print("Введите s: ");
        int s = in.nextInt();
        Number_4 ex = new Number_4();
        int number = (int) Math.pow(10, k - 1);
        System.out.println("Ответ: " + ex.numbersAmount(k, s, number));
    }
}
