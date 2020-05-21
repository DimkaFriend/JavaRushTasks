package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File1.txt
        FileInputStream  fileInputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] b=new long[256];
        long max=0;


        while(fileInputStream.available()>0)
        {
            b[fileInputStream.read()]++;

        }
        fileInputStream.close();

        for(int i = 0 ; i < b.length; i++)
        {
            if(b[i]>max)max=b[i];
        }

        for(int i = 0 ; i < b.length; i++)
        {
            if(b[i]==max)
            {
                System.out.print(i+" ");
            }

        }
    }
}
