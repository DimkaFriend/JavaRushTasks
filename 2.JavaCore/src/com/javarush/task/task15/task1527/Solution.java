package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] key = reader.readLine().split("\\?")[1].trim().split("&");
        for(int i=0;i<key.length;i++)
        {
            System.out.print(key[i].split("=")[0]+" ");

        }
        System.out.println();
        for(int i=0;i<key.length;i++)
        {
            if((key[i].split("=")[0].equals("obj")))
            {
                try {

                    alert(Double.parseDouble(key[i].split("=")[1]));
                }catch (NumberFormatException e)
                {
                    alert(key[i].split("=")[1]);
                }
            }else{}

        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
