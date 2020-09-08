package ru.mirea.pr2;

public class Ball
{
    private double x = 0.0d;
    private double y = 0.0d;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString()
    {
        return "Ball @ (" + this.x + ", " + this.y + ").";
    }
}
