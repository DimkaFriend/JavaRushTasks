package com.javarush.task.task25.task2505;

/* 
Без дураков
*/
public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class MyThread extends Thread {
        private String secretKey;

        private class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
        {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                    System.out.println(String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage()));
                } catch (InterruptedException i) {
                    i.printStackTrace();
                }


            }
        }

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(false);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }
    }

}

