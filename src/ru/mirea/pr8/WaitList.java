package ru.mirea.pr8;

import java.util.Collection;
import java.util.LinkedList;

public class WaitList<E> implements IWaitList
{
    protected LinkedList<E> list = new LinkedList<>();

    public WaitList()
    {

    }

    public WaitList(Collection<E> list)
    {
        this.list = (LinkedList<E>) list;
    }

    @Override
    public void add(Object element)
    {
        list.add((E) element);
    }

    @Override
    public void remove(Object element)
    {
        list.remove(element);
    }

    @Override
    public boolean contains(Object element)
    {
        return list.contains(element);
    }

    @Override
    public boolean containsAll(Collection c)
    {
        return list.containsAll(c);
    }

    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    @Override
    public String toString()
    {
        return "WaitList{" +
                "list=" + list +
                '}';
    }
}
