package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    public static AtomicInteger counter = new AtomicInteger(1);

    public MyThread() {
        count();
    }

    public MyThread(Runnable target) {
        super(target);
        count();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        count();
    }

    public MyThread(String name) {
        super(name);
        count();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        count();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        count();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        count();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        count();
    }

    private void count()
    {
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }
}
