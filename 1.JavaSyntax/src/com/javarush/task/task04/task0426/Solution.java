package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = new Scanner(System.in).nextInt();


        if(i<0){
        switch (i%2)
        {
            case -1:System.out.println("отрицательное нечетное число");break;
            case 0:System.out.println("отрицательное четное число");break;
            default:
        }
        }else{if(i>0)
        {
            switch (i%2)
            {

                case 1:System.out.println("положительное нечетное число");break;
                case 0:System.out.println("положительное четное число");break;
                default:
            }
        }else  System.out.println("ноль");
        }
    }
    }

