package com.javarush.task.task14.task1413;

/**
 * Created by boltenkov on 03.01.2018.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse    mouse;
    private Monitor  monitor;

   public Computer(Keyboard Keyboard, Mouse Mouse, Monitor Monitor)
    {
        this.keyboard=Keyboard;
        this.mouse = Mouse;
        this.monitor = Monitor;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }
}
