package com.javarush.task.task14.task1408;

/**
 * Created by boltenkov on 03.01.2018.
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}