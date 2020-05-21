package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[3];
        int k=0;
        mass[0] = new Scanner(System.in).nextInt();
        mass[1] = new Scanner(System.in).nextInt();
        mass[2] = new Scanner(System.in).nextInt();

        for(int i = 0 ; i < mass.length; i++)
        {
            if (mass[i]>0) k++;
        }

        System.out.println(k);
    }
}
