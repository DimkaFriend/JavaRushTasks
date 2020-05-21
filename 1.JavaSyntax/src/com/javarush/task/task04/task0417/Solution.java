package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();
        int c=new Scanner(System.in).nextInt();

        if((a==b)&&(b==c))System.out.println(a+" "+b+" "+c);
        else
            if(a==b)System.out.println(a+" "+b);
            else
                if(b==c) System.out.println(b+" "+c);
                else
                    if(a==c)System.out.println(a+" "+c);
    }
}