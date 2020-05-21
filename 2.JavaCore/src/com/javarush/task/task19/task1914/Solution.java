package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях

        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString().replaceAll("[\r\n$]","");
        System.setOut(consoleStream);
        int number=0;
        String[] s = result.split(" ");
        if(s[1].toCharArray()[0]=='+'){number+=Integer.parseInt(s[0])+Integer.parseInt(s[2]);}
        if(s[1].toCharArray()[0]=='*'){number+=Integer.parseInt(s[0])*Integer.parseInt(s[2]);}
        if(s[1].toCharArray()[0]=='-'){number+=Integer.parseInt(s[0])-Integer.parseInt(s[2]);}

        System.out.println(result+number);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

