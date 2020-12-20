package ru.mirea.pr10.ex1;

public class Main
{
    public static void main(String[] args)
    {
        AbstractComplexFactory complexFactory = new ConcreteFactory();
        Complex complex = complexFactory.createComplex(12, 3);
    }
}
