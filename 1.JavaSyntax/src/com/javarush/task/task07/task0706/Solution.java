package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] street = new int[15];
        int odd=0,read=0;

        for(int i = 0; i <street.length; i ++)
        {
            street[i] = new Scanner(System.in).nextInt();
            if(i%2==0) read+=street[i]; else odd+=street[i];
        }

        if(read<odd)System.out.print("В домах с нечетными номерами проживает больше жителей.");else System.out.print("В домах с четными номерами проживает больше жителей.");
    }
}
