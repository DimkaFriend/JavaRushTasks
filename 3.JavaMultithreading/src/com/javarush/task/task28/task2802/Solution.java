package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {

    public static class AmigoThreadFactory implements ThreadFactory
    {
        final static AtomicInteger pool = new AtomicInteger(1);
         AtomicInteger thread = new AtomicInteger(1);
        final String namePrefix;

        public AmigoThreadFactory() {
            SecurityManager s = System.getSecurityManager();


            namePrefix = "-pool-"+pool.getAndIncrement()+"-thread-";
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread newThread = new Thread(r,Thread.currentThread().getThreadGroup().getName()+namePrefix+ thread.getAndIncrement());
            newThread.setDaemon(false);
            newThread.setPriority(Thread.NORM_PRIORITY);

            return newThread;
        }
    }
    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {


            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }
}
