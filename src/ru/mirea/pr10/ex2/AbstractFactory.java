package ru.mirea.pr10.ex2;

public interface AbstractFactory
{
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
