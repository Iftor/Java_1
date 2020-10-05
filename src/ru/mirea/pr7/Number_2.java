package ru.mirea.pr7;

import java.util.LinkedList;
import java.util.Scanner;

public class Number_2
{
    public static void main(String[] args)
    {
        System.out.print("Введите 5 карт первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String cardsString = scanner.nextLine();
        LinkedList<Integer> firstPlayerCards = new LinkedList<>();

        for (String card: cardsString.split(" "))
            firstPlayerCards.add(Integer.parseInt(card));

        System.out.print("Введите 5 карт второго игрока: ");
        cardsString = scanner.nextLine();
        LinkedList<Integer> secondPlayerCards = new LinkedList<>();

        for (String card: cardsString.split(" "))
            secondPlayerCards.add(Integer.parseInt(card));

        int firstPlayerCard, secondPlayerCard, movesCounter = 0;

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty() && movesCounter < 106)
        {
            firstPlayerCard = firstPlayerCards.pop();
            secondPlayerCard = secondPlayerCards.pop();

            if (firstPlayerCard > secondPlayerCard)
            {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            }
            else if(firstPlayerCard < secondPlayerCard)
            {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            else
            {
                firstPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            ++movesCounter;
        }

        if (secondPlayerCards.isEmpty())
            System.out.println("first " + movesCounter);
        else if(firstPlayerCards.isEmpty())
            System.out.println("second " + movesCounter);
        else
            System.out.println("botva");
    }
}
