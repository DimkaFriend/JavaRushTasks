package com.javarush.task.task16.task1632;

import com.javarush.task.task16.task1632.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new ThreadInfinitely()));
        threads.add(new Thread(new ThreadInterrupted()));
        threads.add(new Thread(new ThreadUra()));
        threads.add(new ThreadMessage());
        threads.add(new Thread(new ThreadNumberInputs()));
    }

    public static void main(String[] args) throws InterruptedException {

    }


    public static class ThreadInfinitely implements Runnable {

        public ThreadInfinitely() {
            super();
        }

        @Override
        public void run() {
            while (true) {
            }
        }
    }


    public static class ThreadInterrupted implements Runnable {

        public ThreadInterrupted() {
            super();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {

                System.out.println("InterruptedException");
            }
        }
    }


    public static class ThreadUra implements Runnable {

        public ThreadUra() {
            super();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }

        }
    }


        public static class ThreadMessage extends Thread implements Message {
            boolean repeat = true;

            @Override
            public void showWarning() {
                repeat = false;
            }

            @Override
            public void run() {
                while (repeat);
            }
        }








    public static class ThreadNumberInputs implements Runnable {

        public ThreadNumberInputs() {
            super();
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String s = null;
            while (true) {
                try {
                    s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s.equals("N") == true)
                    break;

                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}