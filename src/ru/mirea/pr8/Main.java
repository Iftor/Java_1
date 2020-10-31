package ru.mirea.pr8;

public class Main
{
    public static void main(String[] args)
    {
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(3);
        waitList.add(4);
        waitList.add(5);
        if (waitList.contains(3))
            System.out.println("List contains 3");
        if (!waitList.isEmpty())
            System.out.println("List is not empty");
        waitList.remove(3);
        System.out.println(waitList);

        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add(32);
        boundedWaitList.add(3);
        boundedWaitList.add(54);
        System.out.println(boundedWaitList);

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(5);
        unfairWaitList.add(65);
        unfairWaitList.add(-6);
        unfairWaitList.remove(5);
        unfairWaitList.moveToBack(65);
        System.out.println(unfairWaitList);
    }
}
