package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();

        if (a != b || b!= c){
            if (a==b) System.out.println("3");
            if (b==c) System.out.println("1");
            if (a==c) System.out.println("2");
        }
    }
}
