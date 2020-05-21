package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        a=new Scanner(System.in).nextInt();
        b=new Scanner(System.in).nextInt();
        c=new Scanner(System.in).nextInt();

        if((a+b>c)&&(b+c>a)&&(a+c>b)) System.out.println("Треугольник существует.");else System.out.println("Треугольник не существует.");
    }
}