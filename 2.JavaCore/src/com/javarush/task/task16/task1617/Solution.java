package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {

        RacingClock clock = new RacingClock();
        Thread.sleep(3500);

        if(countSeconds!=0)
        {
            clock.interrupt();
            System.out.print("Прервано!");
        }else
            {
                System.out.print("Марш!");
            }
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while(countSeconds!=0){
                    System.out.print(countSeconds+" ");
                    Thread.sleep(1000);
                    countSeconds--;
                    }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
