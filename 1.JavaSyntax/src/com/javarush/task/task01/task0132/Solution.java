package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        return  (number/100)+ ((number/10) % 10)+((number%100)%10);
        /*return  Integer.parseInt(Character.toString(Integer.toString(number).charAt(0)))
                    + Integer.parseInt(Character.toString(Integer.toString(number).charAt(1)))
                        +Integer.parseInt(Character.toString(Integer.toString(number).charAt(2)));*/
    }
}