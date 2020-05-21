package com.javarush.task.task15.task1529;

/**
 * Created by boltenkov on 11.01.2018.
 */
public class Plane implements Flyable {
    public int kolvo;
    public Plane(int kolvo)
    {
        this.kolvo = kolvo;
    }

    @Override
    public void fly() {

    }
}
