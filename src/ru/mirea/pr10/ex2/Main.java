package ru.mirea.pr10.ex2;

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactory chairFactory = new ChairFactory();
        Client client = new Client();
        client.setChair(chairFactory.createFunctionalChair());
        client.sit();
    }
}
