package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        switch (month)
        {
            case 1:System.out.print("зима");  break;
            case 2:System.out.print("зима");  break;
            case 3:System.out.print("весна");  break;
            case 4:System.out.print("весна");  break;
            case 5:System.out.print("весна");  break;
            case 6:System.out.print("лето"); break;
            case 7:System.out.print("лето");  break;
            case 8:System.out.print("лето"); break;
            case 9:System.out.print("осень");  break;
            case 10:System.out.print("осень") ; break;
            case 11:System.out.print("осень") ; break;
            case 12:System.out.print("зима"); break;
            default:break;
        }
    }
}