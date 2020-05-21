package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread logginThread;
    public LoggingStateThread(Thread thread) {
        this.logginThread =thread;

    }

    @Override
    public void run() {
        super.run();
        Thread.State currentState = logginThread.getState();
        System.out.println(currentState);
        while (!currentState.equals(State.TERMINATED)) {
            Thread.State newState = logginThread.getState();
            if (!newState.equals(currentState)) {
                System.out.println(newState);
                currentState = newState;
            }
        }
        this.interrupt();
    }
}
