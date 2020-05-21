package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable,CustomThreadManipulator {
    private Thread thread;
    @Override
    public void run() {
        try {
            while (!this.thread.isInterrupted())
            {
                System.out.println(this.thread.getName());
                    Thread.sleep(100);


            }
        }catch (InterruptedException e) {
            return;
        }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread(this);
        thread.setName(threadName);
        thread.start();

    }

    @Override
    public void stop() {
        this.thread.interrupt();
    }
}
