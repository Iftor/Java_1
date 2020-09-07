package ru.mirea.inbo0519.pr1;
import java.lang.*;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Green", 26);
        Ball b2 = new Ball("Red", 41);
        Ball b3 = new Ball("Cyan");
        b3.setRadius(43);
        System.out.println(b1);
        System.out.println(b1.intoMeters());
        System.out.println(b2.intoMeters());
        System.out.println(b3.intoMeters());
    }
}
