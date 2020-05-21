package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        int i = new Scanner(System.in).nextInt();

        for( int j=0; j < Integer.toString(i).length();j++)
        {
           if( Integer.parseInt(Character.toString(Integer.toString(i).charAt(j))) %2==0)even++;else odd++;
        }
        System.out.print("Even: "+even+" Odd: "+odd);
    }
}
