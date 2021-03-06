package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() throws InterruptedException {
        while (!isValuePresent)
            this.wait();
        System.out.println("Got: " + value);
        this.isValuePresent = false;
        this.notify();
        return value;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (isValuePresent)
            this.wait();
        this.notify();
        this.value = value;
        System.out.println("Put: " + value);
        this.isValuePresent = true;
    }
}
