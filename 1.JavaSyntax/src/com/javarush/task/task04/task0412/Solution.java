package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = new Scanner(System.in).nextInt();
        switch (i)
        {
            case 0:System.out.println(i);break;
            default: if (i<0) System.out.println(i+1); else System.out.println(i*2);

        }

    }

}