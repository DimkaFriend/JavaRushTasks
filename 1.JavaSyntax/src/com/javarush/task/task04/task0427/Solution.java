package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = new Scanner(System.in).nextInt();
        if((i>0)&&(i<=999))
        switch (Integer.toString(i).toCharArray().length)
        {
            case 1:
                {
                    if(i%2==0)System.out.println("четное однозначное число");else System.out.println("нечетное однозначное число");
                };break;
            case 2:
                {
                    if(i%2==0)System.out.println("четное двузначное число");else System.out.println("нечетное двузначное число");
                };break;
            case 3:
                {
                    if(i%2==0)System.out.println("четное трехзначное число");else System.out.println("нечетное трехзначное число");
                };break;

        }

    }
}
