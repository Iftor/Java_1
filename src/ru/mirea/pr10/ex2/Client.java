package ru.mirea.pr10.ex2;

public class Client
{
    public Chair chair;
    public void sit()
    {
        System.out.println("I sit");
    }
    public void setChair(Chair chair)
    {
        this.chair = chair;
    }
}
