package ru.mirea.pr10.ex1;

public class ConcreteFactory implements AbstractComplexFactory
{
    @Override
    public Complex createComplex()
    {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image)
    {
        return new Complex(real, image);
    }
}
