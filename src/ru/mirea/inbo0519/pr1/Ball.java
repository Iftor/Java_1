package ru.mirea.inbo0519.pr1;

public class Ball
{
    private String color;
    private int radius;

    public Ball(String color, int radius)
    {
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color)
    {
        this.color = color;
        this.radius = 20;
    }
    public Ball()
    {
        this.color = "White";
        this.radius = 20;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return color + ", radius " + radius;
    }
    public float intoMeters()
    {
        return radius / 100f;
    }
}
