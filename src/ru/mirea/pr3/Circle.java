package ru.mirea.pr3;
import java.math.*;

public class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle(double radius)
    {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
