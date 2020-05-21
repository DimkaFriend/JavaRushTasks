package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] numbers = new int[3];
        int positiveNumbers = 0, negativeNumbers = 0;

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
            if(numbers[i] > 0){
                positiveNumbers++;
            }else if(numbers[i] < 0){
                negativeNumbers++;
            }
        }

        System.out.println("количество отрицательных чисел: " + negativeNumbers);
        System.out.println("количество положительных чисел: " + positiveNumbers);

    }
}
