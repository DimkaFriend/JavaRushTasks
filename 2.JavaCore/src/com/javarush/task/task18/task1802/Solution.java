package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File1.txt
        FileInputStream  fileInputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int buff = 256;

        while(fileInputStream.available()>0)
        {
            int buff1 =fileInputStream.read();
            if(buff > buff1)
            {
                buff= buff1;
            }

        }
        fileInputStream.close();
        System.out.println(buff);


    }
}
