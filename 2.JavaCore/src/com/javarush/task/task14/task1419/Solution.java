package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution   {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;



        }catch (NumberFormatException e)
        {
            exceptions.add(e);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }catch (IllegalArgumentException e) {
            exceptions.add(e);
        }catch (IndexOutOfBoundsException e) {
            exceptions.add(e);

        }catch (NoSuchElementException e) {
            exceptions.add(e);

        }catch (ClassCastException e) {
            exceptions.add(e);

        }catch (NullPointerException e) {
            exceptions.add(e);
        }catch (RuntimeException e) {
            exceptions.add(e);

        } catch (Exception e) {
        exceptions.add(e);}


        //напишите тут ваш код

    }
}
