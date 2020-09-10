package ru.mirea.pr3;

public class Square extends Rectangle
{
    public Square()
    {
        this.filled = false;
        this.color = "blue";
        width = 5.0;
        length = 7.0;
    }

    public Square(double side)
    {
        this.width = side;
        this.length = side;
        this.filled = false;
        this.color = "blue";
    }

    public Square(String color, boolean filled, double side)
    {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    public double getSide()
    {
        return this.width;
    }

    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString()
    {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
