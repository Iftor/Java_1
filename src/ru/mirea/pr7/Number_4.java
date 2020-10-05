package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class Number_4
{
    public static void main(String[] args)
    {
        System.out.print("Введите ваши 5 карт: ");
        Scanner scanner = new Scanner(System.in);
        String cardsString = scanner.nextLine();
        Stack<Integer> firstPlayerCards = new Stack<>();

        for (int i = cardsString.length() - 1; i >= 0; --i)
        {
            char charCard = cardsString.charAt(i);
            if (charCard != ' ')
                firstPlayerCards.push(Character.getNumericValue(charCard));
        }
        System.out.print("Введите 5 карт вашего оппонента: ");
        cardsString = scanner.nextLine();
        Stack<Integer> secondPlayerCards = new Stack<>();

        for (int i = cardsString.length() - 1; i >= 0; --i)
        {
            char charCard = cardsString.charAt(i);
            if (charCard != ' ')
                secondPlayerCards.push(Character.getNumericValue(charCard));
        }

        int firstPlayerCard, secondPlayerCard, movesCounter = 1;

        while (!firstPlayerCards.empty() && !secondPlayerCards.empty() && movesCounter <= 106)
        {
            System.out.println("Ход № " + movesCounter);

            System.out.print("Нажмите enter, чтобы открыть карту: ");
            scanner.nextLine();

            firstPlayerCard = firstPlayerCards.pop();
            secondPlayerCard = secondPlayerCards.pop();

            System.out.println("Ваша карта: " + firstPlayerCard + '\n' + "Карта оппонента: " + secondPlayerCard);


            if (firstPlayerCard > secondPlayerCard)
            {
                firstPlayerCards.add(0, firstPlayerCard);
                firstPlayerCards.add(0, secondPlayerCard);
                System.out.println("Вы выиграли на этом ходу!");
            }
            else if(firstPlayerCard < secondPlayerCard)
            {
                secondPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
                System.out.println("Вы проиграли на этотом ходу!");
            }
            else
            {
                firstPlayerCards.add(0, firstPlayerCard);
                secondPlayerCards.add(0, secondPlayerCard);
                System.out.println("Вы сыграли в ничью на этом ходу!");
            }
            System.out.printf("У вас осталось %d карт(ы).\nУ вашего оппонента осталось %d карт(ы).\n\n",
                    firstPlayerCards.size(), secondPlayerCards.size());
            ++movesCounter;
        }

        if (secondPlayerCards.empty())
            System.out.println("Victory " + movesCounter);
        else if(firstPlayerCards.empty())
            System.out.println("Defeat " + movesCounter);
        else
            System.out.println("Botva");
    }
}
