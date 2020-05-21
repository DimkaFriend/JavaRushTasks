package com.javarush.task.task15.task1522;

/**
 * Created by boltenkov on 12.01.2018.
 */
public class Moon implements Planet {
    private  static Moon instance;

    private  Moon(){}

    public  static Moon getInstance()
    {
        if(instance==null)instance = new Moon();
        return Moon.instance;
    }
}
