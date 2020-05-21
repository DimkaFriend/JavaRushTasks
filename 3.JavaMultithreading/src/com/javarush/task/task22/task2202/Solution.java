package com.javarush.task.task22.task2202;

/* 
Найти подстроку
http://www.linkex.ru/java/linked-exception.php базовый принцип работы сцепления исключений
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if((string==null)||(string.split(" ").length<5))
        {
            throw new TooShortStringException("Short");
        }
        String[] result= string.substring(string.indexOf(" ")+1).split(" ");

        return result[0]+" "+result[1]+" "+result[2]+" "+result[3];
    }

    public static class TooShortStringException extends RuntimeException {

        public TooShortStringException(String message) {
        }
    }
}
