package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class Number_1
{
    public static void main(String[] args)
    {
        System.out.print("Введите 5 карт первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String cardsString = scanner.nextLine();
        Stack<Integer> firstPlayerCards = new Stack<>();

        for (int i = cardsString.length() - 1; i >= 0; --i)
        {
            char charCard = cardsString.charAt(i);
            if (charCard != ' ')
                firstPlayerCards.push(Character.getNumericValue(charCard));
        }
        System.out.print("Введите 5 карт второго игрока: ");
        cardsString = scanner.nextLine();
        Stack<Integer> secondPlayerCards = new Stack<>();

        for (int i = cardsString.length() - 1; i >= 0; --i)
        {
            char charCard = cardsString.charAt(i);
            if (charCard != ' ')
                secondPlayerCards.push(Character.getNumericValue(charCard));
        }

        int firstPlayerCard, secondPlayerCard, movesCounter = 0;

        while (!firstPlayerCards.empty() && !secondPlayerCards.empty() && movesCounter < 106)
        {
            firstPlayerCard = firstPlayerCards.pop();
            secondPlayerCard = secondPlayerCards.pop();

            if (firstPlayerCard > secondPlayerCard)
            {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
            }
            else if(firstPlayerCard < secondPlayerCard)
            {
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            }
            else
            {
                firstPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
            }
            ++movesCounter;
        }

        if (secondPlayerCards.empty())
            System.out.println("first " + movesCounter);
        else if(firstPlayerCards.empty())
            System.out.println("second " + movesCounter);
        else
            System.out.println("botva");
    }
}
