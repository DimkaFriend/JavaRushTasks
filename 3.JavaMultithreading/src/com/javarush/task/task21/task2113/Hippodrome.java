package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for(Horse horse: this.getHorses())
        {
            horse.move();
        }
    }

    public void print() {

        for(Horse horse: this.getHorses())
        {
            horse.print();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void run() throws InterruptedException {
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(200);
            move();

            print();
        }
    }

    public Horse getWinner()
    {
        Horse winner = null;

        for(Horse horse:this.getHorses())
        {
            if(winner!=null)
            {
                if(winner.getDistance()<horse.getDistance())
                {
                    winner= horse;
                }
            }else
                {
                    winner=horse;
                }
        }
        return winner;
    }

    public void printWinner()
    {
        System.out.println("Winner is "+this.getWinner().getName()+"!");
    }
    
    public static void main(String[] args) throws InterruptedException {
        //new Horse("Lui",3.0,0),new Horse("Sem",3.0,0),new Horse("Glory",3.0,0)
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Lui",3.0,0));
        horses.add(new Horse("Sem",3.0,0));
        horses.add(new Horse("Glory",3.0,0));

        game = new Hippodrome(horses);

        game.run();

        game.printWinner();
    }
}