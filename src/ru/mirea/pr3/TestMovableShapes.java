package ru.mirea.pr3;

public class TestMovableShapes
{
    public static void main(String[] args)
    {
        MovablePoint p = new MovablePoint(2, 5, 3, 1);
        p.moveUp();
        p.moveDown();
        p.moveLeft();
        p.moveRight();
        System.out.println(p);
        MovableCircle c = new MovableCircle(-3, -5, 2, -4, 7);
        c.moveUp();
        c.moveDown();
        c.moveLeft();
        c.moveRight();
        System.out.println(c);
        MovableRectangle r = new MovableRectangle(3, -2, 5, 0, 10, -4);
        r.moveUp();
        r.moveDown();
        r.moveLeft();
        r.moveRight();
        System.out.println(r);
    }
}
