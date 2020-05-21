package com.javarush.task.task15.task1522;

/**
 * Created by boltenkov on 12.01.2018.
 */
public class Sun implements Planet {
    private  static Sun instance;

    private  Sun(){}

    public  static Sun getInstance()
    {
        if(instance==null)instance = new Sun();
        return Sun.instance;
    }
}
