package ru.mirea.pr8;

public class UnfairWaitList<E> extends WaitList
{
    public UnfairWaitList()
    {

    }
    public void remove(Object element)
    {
        for (int i = 1; i < list.size(); ++i)
        {
            if (list.get(i) == element)
            {
                list.remove(i);
                return;
            }
        }
    }
    public void moveToBack(E element)
    {
        list.remove(element);
        list.add(element);
    }
}
