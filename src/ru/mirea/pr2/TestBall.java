package ru.mirea.pr2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball = new Ball(10.2, 5.8);
        System.out.println(ball.getX());
        ball.setX(8.5);
        System.out.println(ball.getY());
        ball.setY(9.6);
        ball.setXY(21.4, 17.1);
        ball.move(3.2, 5.9);
        System.out.println(ball);
    }
}
