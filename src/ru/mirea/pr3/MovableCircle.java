package ru.mirea.pr3;

public class MovableCircle implements Movable
{
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=(" + center.x +
                ", " + center.y + ')' +
                ", xSpeed=" + center.xSpeed +
                ", ySpeed=" + center.ySpeed +
                '}';
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}
