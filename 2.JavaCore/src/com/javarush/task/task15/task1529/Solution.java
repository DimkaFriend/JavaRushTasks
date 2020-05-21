package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static Flyable result;
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        switch (key)
        {
            case"helicopter":result= new Helicopter();break;
            case"plane":{

                try {
                    result= new Plane(Integer.parseInt(reader.readLine()));
                }catch (NumberFormatException e){}
            }break;
        }
    }
}