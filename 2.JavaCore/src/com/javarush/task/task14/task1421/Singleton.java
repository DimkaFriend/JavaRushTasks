package com.javarush.task.task14.task1421;

/**
 * Created by boltenkov on 04.01.2018.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating Singleton");
            instance = new Singleton();
        }
        return instance;
    }
}
