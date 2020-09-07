package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog(String name)
    {
        this.name = name;
        this.age = 0;
    }
    public Dog()
    {
        this.name = "Pup";
        this.age = 0;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name + ", age " + age;
    }

    public int intoHumanAge()
    {
        return age * 7;
    }
}
