package com.javarush.task.task15.task1522;

/**
 * Created by boltenkov on 12.01.2018.
 */
public class Earth implements Planet {
    private  static Earth instance ;

    private  Earth(){}

    public static Earth getInstance()
    {
        if(instance==null)instance = new Earth();
        return Earth.instance;
    }
}
