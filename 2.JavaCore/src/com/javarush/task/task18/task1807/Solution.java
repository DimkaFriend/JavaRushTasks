package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count=0;
        while(fileInputStream.available()>0)
        {
            int i = fileInputStream.read();
            char c =(char) i;
            if(','==c)
            {
                count++;
            }
        }
        fileInputStream.close();
        System.out.print(count);
    }
}
