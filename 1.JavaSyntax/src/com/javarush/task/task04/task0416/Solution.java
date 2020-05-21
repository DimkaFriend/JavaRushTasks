package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double time = scan.nextDouble();

        if((time%5>=0)&(time%5<3))
        {
            System.out.print("зелёный");
        }else
            {
                if((time%5>=3)&(time%5<4))
                {
                    System.out.print("жёлтый");
                }else{
                    if((time%5>=4)&(time%5<5))
                    {
                        System.out.print("красный");
                    }
                }
            }
    }
}