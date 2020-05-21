package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads=0;

    public static void main(String[] args) {
        new GenerateThread();
    }

    public static class GenerateThread extends  Thread {
        @Override
        public String toString() {
            return this.getName()+" created";
        }

        public GenerateThread()
        {

            super(String.valueOf(++Solution.countCreatedThreads));

            this.start();

        }

        @Override
        public void run() {
            if (Solution.countCreatedThreads<=Solution.count){
                System.out.println(new GenerateThread());

            }
        }


    }
}
