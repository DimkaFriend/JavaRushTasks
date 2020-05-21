package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/


import java.util.Scanner;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double k = 0, s=0;
        double arf =0;
        for(;;)
        {
            int i = scan.nextInt();
            if(i!=-1)
            {s+=i;
                k++;}else break;
        }
        arf = s/k;
        System.out.println(arf);
    }
}

