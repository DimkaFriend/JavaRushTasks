package com.javarush.task.task15.task1530;

/**
 * Created by boltenkov on 12.01.2018.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
}
